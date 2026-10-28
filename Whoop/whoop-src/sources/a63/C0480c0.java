package a63;

import bc3.AbstractC3006f0;
import e63.C12775d;
import e63.C12777f;
import io.ktor.client.plugins.SendCountExceedException;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v53.C35709c;
import w53.C36845b;

/* JADX INFO: renamed from: a63.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0480c0 implements InterfaceC0492i0 {

    /* JADX INFO: renamed from: a */
    public final C35709c f1630a;

    /* JADX INFO: renamed from: b */
    public int f1631b;

    /* JADX INFO: renamed from: c */
    public C36845b f1632c;

    public C0480c0(C35709c client) {
        AbstractC22676k.m65750j(client, "client");
        this.f1630a = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a63.InterfaceC0492i0
    /* JADX INFO: renamed from: a */
    public final Object mo1199a(C12775d c12775d, AbstractC32269c abstractC32269c) {
        C0478b0 c0478b0;
        C0480c0 c0480c0;
        if (abstractC32269c instanceof C0478b0) {
            c0478b0 = (C0478b0) abstractC32269c;
            int i13 = c0478b0.f1625z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0478b0.f1625z = i13 - Integer.MIN_VALUE;
            } else {
                c0478b0 = new C0478b0(this, abstractC32269c);
            }
        } else {
            c0478b0 = new C0478b0(this, abstractC32269c);
        }
        Object objM95529a = c0478b0.f1623x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0478b0.f1625z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM95529a);
            C36845b c36845b = this.f1632c;
            if (c36845b != null) {
                AbstractC3006f0.m8714h(c36845b, null);
            }
            int i15 = this.f1631b;
            if (i15 >= 20) {
                throw new SendCountExceedException("Max send count 20 exceeded. Consider increasing the property maxSendCount if more is required.");
            }
            this.f1631b = i15 + 1;
            C12777f c12777f = this.f1630a.f151927G;
            Object obj = c12775d.f43712d;
            c0478b0.f1622w = this;
            c0478b0.f1625z = 1;
            objM95529a = c12777f.m95529a(c12775d, obj, c0478b0);
            if (objM95529a == enumC31071a) {
                return enumC31071a;
            }
            c0480c0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0480c0 = c0478b0.f1622w;
            AbstractC34132o.m107864I(objM95529a);
        }
        C36845b c36845b2 = objM95529a instanceof C36845b ? (C36845b) objM95529a : null;
        if (c36845b2 == null) {
            throw new IllegalStateException(AbstractC25012a.m73375h(objM95529a, "Failed to execute send pipeline. Expected [HttpClientCall], but received ").toString());
        }
        c0480c0.f1632c = c36845b2;
        return c36845b2;
    }
}
