package p579wc;

import bc3.AbstractC3028k2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p470rv.C31821a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import va3.AbstractC35854l;
import vf3.AbstractC35952b;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: wc.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C37108o extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ArrayList f158739E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f158740F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f158741G;

    /* JADX INFO: renamed from: w */
    public Process f158742w;

    /* JADX INFO: renamed from: x */
    public BufferedReader f158743x;

    /* JADX INFO: renamed from: y */
    public StringBuilder f158744y;

    /* JADX INFO: renamed from: z */
    public int f158745z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37108o(ArrayList arrayList, long j7, long j13, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f158739E = arrayList;
        this.f158740F = j7;
        this.f158741G = j13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C37108o(this.f158739E, this.f158740F, this.f158741G, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C37108o) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws IOException {
        BufferedReader bufferedReader;
        StringBuilder sb4;
        Process process;
        String string;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.f158745z;
        if (i13 == 0) {
            AbstractC34132o.m107864I(obj);
            Process processStart = new ProcessBuilder(new String[0]).command(this.f158739E).start();
            InputStream inputStream = processStart.getInputStream();
            AbstractC22676k.m65749i(inputStream, "getInputStream(...)");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
            StringBuilder sb5 = new StringBuilder();
            C31821a c31821a = new C31821a(bufferedReader2, new char[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED], sb5, this.f158741G, processStart, null);
            this.f158742w = processStart;
            this.f158743x = bufferedReader2;
            this.f158744y = sb5;
            this.f158745z = 1;
            if (AbstractC3028k2.m8748b(this.f158740F, c31821a, this) == enumC31071a) {
                return enumC31071a;
            }
            bufferedReader = bufferedReader2;
            sb4 = sb5;
            process = processStart;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb4 = this.f158744y;
            bufferedReader = this.f158743x;
            process = this.f158742w;
            AbstractC34132o.m107864I(obj);
        }
        bufferedReader.close();
        if (process.exitValue() == 0) {
            string = sb4.toString();
        } else {
            InputStream errorStream = process.getErrorStream();
            AbstractC22676k.m65749i(errorStream, "getErrorStream(...)");
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(errorStream, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
            try {
                String strM114200h = AbstractC35952b.m114200h(bufferedReader3);
                bufferedReader3.close();
                string = strM114200h;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(bufferedReader3, th3);
                    throw th4;
                }
            }
        }
        AbstractC22676k.m65747g(string);
        return new C23465k(new Integer(process.exitValue()), string);
    }
}
