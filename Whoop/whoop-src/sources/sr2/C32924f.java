package sr2;

import a82.C0570a;
import a92.C0589a;
import ac2.C0744d;
import ah1.C0891a;
import al0.C0975j;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1871f;
import ao1.C1875j;
import ar0.C1927b;
import av0.C2093a;
import b12.InterfaceC2285a;
import b12.InterfaceC2286b;
import b22.C2334a;
import b52.C2742b;
import b82.InterfaceC2804a;
import b83.C2807c;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import bf1.C3200a;
import bh1.C3251c;
import bh2.C3253b;
import bi2.InterfaceC3288d;
import br1.C3558a;
import bt2.C3629d;
import bv0.C3670a;
import bz1.C3715a;
import c12.InterfaceC3852c;
import c61.C4272a;
import c70.C4281d;
import c72.C4284b;
import c92.C4329a;
import c92.C4335g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca2.C4362b;
import ca2.InterfaceC4366f;
import ca2.InterfaceC4372l;
import cb2.C4388a;
import ci2.InterfaceC4733b;
import cn1.C4851a;
import com.iterable.iterableapi.C5341k;
import com.iterable.iterableapi.InterfaceC5384x;
import com.iterable.iterableapi.InterfaceC5385x0;
import com.whoop.WhoopApplication;
import com.whoop.ble.scan.C6050a;
import com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.local.room.WhoopDatabase;
import com.whoop.data.onboarding.OnboardingStatusInteractor;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.remote.RemoteDataSource;
import com.whoop.data.remote.commons.AppExecutors;
import com.whoop.data.repositories.AnalyticsUserRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryImplKt;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.data.repositories.StartActivityRepository;
import com.whoop.data.repositories.UserRepository;
import com.whoop.data.room.CachedStrapPacketDatabase;
import com.whoop.navigation.C9594a;
import com.whoop.p069ui.C10604o;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import com.whoop.p069ui.main.C10602a;
import com.whoop.profile.p067di.ProfileModule;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.NotificationApi;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.push.C9984a;
import com.whoop.service.push.C9985b;
import com.whoop.service.push.notifications.C9993e;
import com.whoop.service.sync.C10019a;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import com.whoop.stories.AbstractC10269b;
import com.whoop.stories.C10270c;
import com.whoop.workmanager.C10923a;
import cq0.C11059g;
import cq1.C11061a;
import cs0.C11097a;
import cu0.InterfaceC11114b;
import cw0.C11158c;
import d12.C11477a;
import d82.InterfaceC11777a;
import d92.C11818a;
import dd2.C11971a;
import di0.C12054a;
import dj0.C12066b;
import dj0.C12086v;
import dp0.InterfaceC12251g;
import dq0.C12283a;
import dq0.C12286d;
import dq0.InterfaceC12284b;
import ds2.C12348b;
import dt0.InterfaceC12361d;
import dx0.C12423b;
import dy1.C12446b;
import dy1.C12447c;
import dy1.C12448d;
import e12.C12585a;
import e82.C12853a;
import e93.AbstractC12889b;
import eg1.C13167a;
import ej0.C13227a;
import ek1.C13303b;
import em0.C13324a;
import em2.C13353a;
import eq1.C13562a;
import es1.C13590a;
import et0.InterfaceC13596a;
import ex0.C13726b;
import f03.C13919a;
import f70.C14202r;
import f70.C14208u;
import f82.InterfaceC14252c;
import f91.C14283a;
import f91.C14285c;
import f91.C14286d;
import f92.C14288a;
import fg1.C14458d;
import fg1.InterfaceC14457c;
import fi0.InterfaceC14515a;
import fi2.C14524a;
import fl2.C14570a;
import fq0.C14683b;
import fr0.C14711a;
import g52.C15495a;
import g82.InterfaceC15574a;
import g92.C15607c;
import g92.C15608d;
import g92.InterfaceC15606b;
import ga2.C15622a;
import ge3.AbstractC15751g;
import gg1.InterfaceC15825a;
import gj2.C15921b;
import gt0.InterfaceC16182d;
import h03.C16604b;
import h82.C17015a;
import h92.C17029a;
import hc3.AbstractC17182o;
import hf1.InterfaceC17235b;
import hf2.C17238b;
import hi0.AbstractC17307e;
import hi0.AbstractC17312j;
import hi1.C17315a;
import hj0.C17343b;
import hj0.C17345d;
import hj0.C17363v;
import hj0.InterfaceC17346e;
import hj0.InterfaceC17362u;
import hk2.C17390a;
import hl1.C17405h;
import ho0.C17536e;
import hw2.C17704a;
import hx0.C17708d;
import hy1.C17809a;
import hz1.C17815a;
import i03.C17848a;
import i12.C17866b;
import i42.C18085a;
import i52.C18128a;
import i62.C18156a;
import i92.C18265j;
import i92.C18270o;
import i92.InterfaceC18260e;
import ia0.C18292a;
import ia2.C18294b;
import ic2.C18400e;
import ig2.C18474d;
import in0.C18720b;
import in2.C18729a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.ChatClient;
import iu1.C20936a;
import iv0.C20950a;
import ix2.C21024c;
import iy1.InterfaceC21030c;
import j02.C21135c0;
import j02.C21138e;
import j02.C21167s0;
import j02.C21181z0;
import j02.InterfaceC21153l0;
import j02.InterfaceC21159o0;
import j52.C21340a;
import j93.InterfaceC21461d;
import java.io.File;
import java.time.Clock;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import jb2.C21540a;
import jc2.C21606a;
import je1.C21621a;
import ji0.C21717e;
import ji0.InterfaceC21718f;
import jj1.C21740b;
import jk0.C21748b;
import jq2.C21889a;
import js0.AbstractC21909c;
import k02.C22095a;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kf1.C22441b;
import kg0.C22453a;
import kh3.C22488a;
import ki0.C22501a;
import kr0.C22804a;
import kv1.C22844a;
import l52.C23359a;
import l62.C23382c;
import l83.C23454a0;
import l83.EnumC23463i;
import lc2.C23830a;
import lj0.C24465d;
import lj0.C24470i;
import lk2.C24497d;
import lm0.C24506a;
import lm0.C24509d;
import m02.InterfaceC24882a;
import m02.InterfaceC24883b;
import m83.AbstractC25265s;
import m92.C25327j;
import mb2.C25383a;
import md2.C25454b;
import mh2.C25561a;
import mi1.C25575d;
import mu0.InterfaceC25949a;
import mu1.C25955b;
import mu2.C25961f;
import mv0.C25970a;
import mx0.C25993c;
import n50.C26293d;
import n52.C26303b;
import n92.C26480b;
import n92.C26481c;
import n92.C26482d;
import n92.C26484f;
import n92.C26486h;
import n92.InterfaceC26483e;
import nc2.C26570a;
import nd1.C26575a;
import nd1.C26577c;
import nd1.C26579e;
import nd1.C26583i;
import nd1.C26587m;
import nd1.InterfaceC26584j;
import nf0.C26659b;
import ni0.C26732c;
import ni0.C26733d;
import ni1.C26734a;
import nl1.C26813a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nr1.C27078a;
import nx0.C27218a;
import nz1.C27306b;
import o02.C27350a;
import o02.C27352c;
import o02.InterfaceC27353d;
import o32.C27515a;
import o92.C27696c0;
import o92.C27702f0;
import o92.C27705h;
import o92.C27707i;
import o92.C27710j0;
import o92.C27719q;
import o92.C27721s;
import od1.C27838b;
import od1.C27839b0;
import od1.C27843f;
import od1.C27858u;
import od1.C27861x;
import od1.C27862y;
import od1.C27863z;
import od1.InterfaceC27837a0;
import on1.C28047b;
import on2.C28049b;
import on2.C28051d;
import or0.C28141a;
import or2.C28143a;
import or2.C28150c;
import or2.C28158e1;
import or2.C28159f;
import or2.C28162g;
import or2.C28183n;
import or2.C28185n1;
import or2.C28195r;
import or2.C28204u;
import or2.C28210w;
import or2.C28216y;
import or2.C28217y0;
import or2.InterfaceC28172j0;
import or2.InterfaceC28186o;
import org.joda.time.DateTimeZone;
import org.koin.core.error.DefinitionParameterException;
import ox0.C28447a;
import oy1.C28473a;
import oy1.C28474b;
import p007a6.InterfaceC0422g;
import p02.C28590b;
import p031b9.AbstractC2875y;
import p114eb.AbstractC12939a0;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p249jc.C21596v;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p705ea2.C12899c0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p734sl0.C32581a1;
import p92.C29014c;
import p92.C29017f;
import p92.C29019h;
import p92.C29020i;
import pd1.C29104a;
import pf.AbstractC29125c;
import pf1.C29150a;
import pg1.C29163a;
import pi2.C29256a;
import pj1.C29297a;
import pk0.C29331a;
import pk0.InterfaceC29333c;
import pr2.C29493a;
import pw2.C29590a;
import q03.C29751a;
import q60.C29996a;
import q82.C30053a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q92.C30076h;
import qf3.C30330b;
import qg1.C30347b;
import qh2.C30370b;
import qi1.C30412b;
import qo0.C30525a;
import qp0.C30531a;
import qq1.C30551b;
import qw2.InterfaceC30696d;
import qx0.C30748d;
import qy1.C30776a;
import r03.C30844a;
import r03.C30846c;
import r03.InterfaceC30845b;
import r22.C30890b;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rb0.C31190g;
import rc2.C31235a;
import rd1.C31245d;
import rf3.C31362a;
import rf3.C31365d;
import rh0.C31438b;
import rh2.C31440a;
import rj0.C31486a;
import rk2.C31505i;
import rm0.C31585c;
import rm0.C31586d;
import rn2.C31615f;
import rr1.C31763b;
import rr2.C31776m;
import rr2.C31778o;
import rr2.InterfaceC31766c;
import rr2.InterfaceC31775l;
import rv1.C31842a;
import rw0.C31870a;
import rx0.C31897b;
import s03.C32052a;
import s52.C32223d;
import s52.C32225f;
import s72.C32242a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sa2.C32326a;
import sf1.C32446a;
import sf1.C32447b;
import sh1.C32506e;
import sk0.C32571a;
import sk2.C32574a;
import st0.InterfaceC32957a;
import su0.C33012b;
import su0.C33013c;
import sv1.C33037c;
import sx0.C33063e;
import t03.C33267a;
import t03.C33269c;
import t03.InterfaceC33268b;
import t52.C33545a;
import t62.C33557a;
import t82.C33615a;
import td1.C33706d;
import td1.C33709g;
import td1.InterfaceC33704b;
import tf3.C33768a;
import tm2.C33954a;
import tr0.C34093a;
import tr2.C34103a;
import tr2.C34104b;
import tr2.C34106d;
import tr2.C34107e;
import tr2.C34112j;
import tr2.InterfaceC34108f;
import tr2.InterfaceC34114l;
import tr2.InterfaceC34116n;
import tu0.C34187a;
import tx0.C34239b;
import u92.C34658b;
import u92.C34660d;
import uc2.C34762b;
import ud1.C34791a;
import uf2.C34910a;
import uf3.C34911a;
import uh0.C34965c;
import uh2.C34968a;
import ui1.C35018a;
import ui1.C35019b;
import un0.C35094b;
import uo0.C35139a;
import up0.C35150a;
import ur2.C35199a;
import ur2.C35201c;
import us0.C35210f;
import us0.InterfaceC35205a;
import us0.InterfaceC35212h;
import uu0.C35234a;
import v32.C35613a;
import v82.C35799a;
import va3.AbstractC35846d;
import vb2.C35871a;
import vd1.C35907a;
import vd1.C35910d;
import vf3.AbstractC35952b;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vj2.C36072a;
import vk1.C36088b;
import vm2.C36156a;
import vm2.C36157b;
import vm2.C36159d;
import vm2.C36161f;
import vm2.C36165j;
import vm2.C36167l;
import vm2.C36168m;
import vr2.C36309b;
import vr2.C36311d;
import vr2.C36312e;
import vr2.InterfaceC36310c;
import vt0.C36484a;
import w92.C36966a;
import w92.C36967b;
import wb3.AbstractC37056f;
import we1.C37223g;
import we1.InterfaceC37217a;
import we1.InterfaceC37225i;
import wg1.C37264c;
import wj1.C37319a;
import wm0.C37378a;
import wm2.C37391a;
import wq0.C37503a;
import ws1.C37608b;
import wt0.C37618a;
import wu0.C37638a;
import wu0.InterfaceC37639b;
import x32.C37948a;
import x42.C37966c;
import x52.C37994b;
import x62.C38028a;
import x82.C38075b;
import x82.C38076c;
import x82.C38080g;
import x82.C38082i;
import x82.InterfaceC38079f;
import x90.InterfaceC38100f;
import x92.C38104a;
import xe1.C38231a;
import xf3.C38266c;
import xg1.C38272a;
import xh1.C38309a;
import xh2.C38312c;
import xl2.C38455b;
import xr0.C38627a;
import xr1.C38629b;
import xr1.C38630c;
import xs1.C38639a;
import xs2.C38640a;
import xu0.InterfaceC38652a;
import xv1.C38669a;
import y42.C39228j;
import y82.C39343f;
import y82.C39344g;
import y82.InterfaceC39338a;
import y92.C39352a;
import ya2.C39357a;
import yf2.C39521b;
import yl2.C39641h;
import yp0.InterfaceC39700a;
import yr2.C39737b;
import yr2.InterfaceC39736a;
import yu1.C39790a;
import yx0.C39839a;
import z12.C39997a;
import z82.C40190d;
import z82.C40191e;
import z82.C40192f;
import z82.C40193g;
import z82.C40195i;
import z82.C40196j;
import z82.C40197k;
import z82.InterfaceC40188b;
import z92.InterfaceC40205a;
import zc2.C40537a;
import zf1.C40612a;
import zi2.C40701e;
import zm0.C40888d;
import zr2.C41072c;
import zr2.InterfaceC41070a;
import zz2.C41258e;

/* JADX INFO: renamed from: sr2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lsr2/f;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32924f implements InterfaceC26584j {

    /* JADX INFO: renamed from: c */
    public static final int f137199c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C15622a(), new C26293d(), new C29996a(), new C4281d(), new C26575a(), new C26732c(), new C26659b(), new C22453a(), new C31190g(), new C0975j(), new C31438b(), new C12054a(), new C32918a(), new C22501a(), new C13227a(), new C30551b(), new C13324a(), new C31585c(), new C31586d(), new C40888d(), new C18720b(), new C35094b(), new C17536e(), new C30525a(), new C37503a(), new C1927b(), new C14711a(), new C28141a(), new C22804a(), new C14683b(), new C34093a(), new C38627a(), new C11097a(), new C37319a(), new C3670a(), new C26577c(), new C32927i(), new C26579e(), new C34187a(), new C37618a(), new C20950a(), new C25970a(), new C11158c(), new C26583i(), new C31870a(), new C32928j(), new C13726b(), new C39839a(), new C14283a(), new C14285c(), new C14286d(), new C38669a(), new C21540a(), new C21621a(), new C38231a(), new C26587m(), new C3200a(), new C22441b(), new C30748d(), new C28447a(), new C33063e(), new C34239b(), new C31897b(), new C27218a(), new C29150a(), new C32447b(), new C40612a(), new C13167a(), new C38272a(), new C30347b(), new C25383a(), new C3251c(), new C38309a(), new C26734a(), new C21740b(), new C30412b(), new C35018a(), new C13303b(), new C35019b(), new C36088b(), new C4851a(), new C17405h(), new C28047b(), new C1875j(), new C11061a(), new C3558a(), new C27078a(), new C31763b(), new C13590a(), new C35871a(), new C37608b(), new C20936a(), new C0744d(), new C25955b(), new C39790a(), new C22844a(), new C33037c(), new C12447c(), new C17809a(), new C30776a(), new C3715a(), new C17815a(), new C18294b(), new C22095a(), new C32930l(), new C27306b(), new C28590b(), new C32932n(), new C11477a(), new C12585a(), new C39997a(), new C17866b(), new C2334a(), new C30890b(), new C27515a(), new C37948a(), new C18085a(), new ProfileModule(), new C2742b(), new C18128a(), new C26570a(), new C26303b(), new C33545a(), new C37994b(), new C18156a(), new C31235a(), new C33557a(), new C32941w(), new C38028a(), new C4284b(), new C32242a(), new C33615a(), new C32942x(), new C17015a(), new C30053a(), new C35799a(), new C11971a(), new C32326a(), new C4388a(), new C18400e(), new C23830a(), new C11971a(), new C25454b(), new C17238b(), new C34910a(), new C39521b(), new C18474d(), new C3253b(), new C38312c(), new C34968a(), new C31440a(), new C14524a(), new C29256a(), new C40701e(), new C15921b(), new C34762b(), new C36072a(), new C17390a(), new C24497d(), new C14570a(), new C38455b(), new C13353a(), new C40537a(), new C31615f(), new C28051d(), new C21889a(), new C32919a0(), new C3629d(), new C25961f(), new C17704a(), new C29590a(), new C31486a(), new C32571a(), new C21024c(), new C41258e(), new C12348b(), new C13919a());

    /* JADX INFO: renamed from: sr2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.util.di.AppModule$define$1$125$1", m100430f = "AppModule.kt", m100431l = {1217}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", ""}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f137201w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38266c f137202x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f137202x = c38266c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f137202x, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137201w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC38100f interfaceC38100f = (InterfaceC38100f) this.f137202x.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC38100f.class), null);
                this.f137201w = 1;
                obj = interfaceC38100f.mo122073b(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return Boolean.valueOf(obj != null);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: sr2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f137203w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f137204x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137205y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f137203w = c38266c;
            this.f137204x = interfaceC35951a;
            this.f137205y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.iterable.iterableapi.x0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC5385x0 invoke() {
            return this.f137203w.m122602a(this.f137205y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC5385x0.class), this.f137204x);
        }
    }

    /* JADX INFO: renamed from: sr2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f137206w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f137207x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f137208y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f137206w = c38266c;
            this.f137207x = interfaceC35951a;
            this.f137208y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.iterable.iterableapi.x, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC5384x invoke() {
            return this.f137206w.m122602a(this.f137208y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC5384x.class), this.f137207x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final C33954a m103450A2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C33954a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final InterfaceC14252c m103451A3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35910d((InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC15574a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC15574a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public static final String m103452A4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return "tfqstp2mt4s5";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final C37391a m103456B2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C37391a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final C34791a m103457B3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34791a((InterfaceC33704b) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC33704b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final ChatClient m103458B4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ChatClient.INSTANCE.instance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C2 */
    public static final C34104b m103462C2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34104b(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final C39344g m103463C3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39344g((InterfaceC14252c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14252c.class), null), (InterfaceC11777a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC11777a.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (InterfaceC2804a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2804a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public static final C4335g m103464C4(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Context contextM88532i = AbstractC29125c.m88532i(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4335g(contextM88532i, ((C4329a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null)).getBluetoothAdapter(), (C33706d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C33706d.class), null), (InterfaceC4366f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4366f.class), null), (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C21748b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21748b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final C27839b0 m103468D2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27839b0((ActivitiesApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(ActivitiesApi.class), null), (C29017f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29017f.class), null), new b(factory, null), (C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("UserStateLifecycleObserver"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final C4329a m103469D3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C4329a(BluetoothAdapter.getDefaultAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public static final InterfaceC29333c m103470D4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29331a(AbstractC3006f0.m8708b(AbstractC3050q0.f12077a.plus(AbstractC3006f0.m8710d())), null, (InterfaceC35212h) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35212h.class), null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final C17343b m103474E2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C17345d c17345d = (C17345d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null);
        C29493a c29493a = (C29493a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29493a.class), null);
        InterfaceC35205a interfaceC35205a = (InterfaceC35205a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35205a.class), null);
        UserRepository userRepository = (UserRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UserRepository.class), null);
        LanguageRepository languageRepository = (LanguageRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null);
        C40192f c40192f = (C40192f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40192f.class), null);
        C28210w c28210w = (C28210w) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28210w.class), null);
        C17848a c17848a = (C17848a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17848a.class), null);
        C27861x c27861x = (C27861x) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27861x.class), null);
        C27843f c27843f = (C27843f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27843f.class), null);
        C34104b c34104b = (C34104b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34104b.class), null);
        C4335g c4335g = (C4335g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C4335g.class), null);
        C18292a c18292a = (C18292a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C18292a.class), null);
        C14202r c14202r = (C14202r) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C14202r.class), null);
        C27838b c27838b = (C27838b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27838b.class), null);
        C24470i c24470i = (C24470i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C24470i.class), null);
        C32506e c32506e = (C32506e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C32506e.class), null);
        C29297a c29297a = (C29297a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29297a.class), null);
        C13562a c13562a = (C13562a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C13562a.class), null);
        OnboardingStatusInteractor onboardingStatusInteractor = (OnboardingStatusInteractor) single.m122602a(null, c22673i0.getOrCreateKotlinClass(OnboardingStatusInteractor.class), null);
        C27702f0 c27702f0 = (C27702f0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27702f0.class), null);
        C27707i c27707i = (C27707i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27707i.class), null);
        C9993e c9993e = (C9993e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C9993e.class), null);
        C31842a c31842a = (C31842a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null);
        C30370b c30370b = (C30370b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30370b.class), null);
        C2093a c2093a = (C2093a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C2093a.class), null);
        C28195r c28195r = (C28195r) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28195r.class), null);
        C12423b c12423b = (C12423b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12423b.class), null);
        C25993c c25993c = (C25993c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25993c.class), null);
        return new C17343b(c18292a, c17848a, c34104b, c17345d, c29493a, interfaceC35205a, c4335g, c14202r, c27838b, c2093a, c28195r, c27843f, c12423b, (C26733d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C26733d.class), null), c28210w, (C21717e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21717e.class), null), (C37223g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37223g.class), null), c32506e, c29297a, c25993c, c13562a, c40192f, (C38639a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C38639a.class), null), languageRepository, c31842a, c30370b, onboardingStatusInteractor, c24470i, c27702f0, c27707i, c9993e, c27861x, userRepository, (C37264c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37264c.class), null), (C26813a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C26813a.class), null), (C31778o) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31778o.class), null), (C37966c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37966c.class), null), (C12448d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12448d.class), null), (C39228j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39228j.class), null), (InterfaceC21153l0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null), (InterfaceC2285a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2285a.class), null), (C24465d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C24465d.class), null), (C27839b0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27839b0.class), null), (C24509d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C24509d.class), null), (C12853a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12853a.class), null), (C12286d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12286d.class), null), (C31505i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31505i.class), null), (C32574a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C32574a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final long m103475E3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public static final C10923a m103476E4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C10923a c10923a = new C10923a((C32052a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C32052a.class), null), (C30844a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30844a.class), null), (C17708d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17708d.class), null), (C33267a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C33267a.class), null), (C17315a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17315a.class), null), (AbstractC18377p0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), (InterfaceC27837a0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (C16604b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C16604b.class), null), (C28473a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28473a.class), null), (C21340a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21340a.class), null), (C0891a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C0891a.class), null), (C15495a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C15495a.class), null), (C28474b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28474b.class), null), (C32574a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C32574a.class), null));
        c10923a.m28978a();
        return c10923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final C40192f m103480F2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40192f((InterfaceC18260e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (C40191e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final long m103481F3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return 5000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public static final C38082i m103482F4(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Context contextM88532i = AbstractC29125c.m88532i(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38082i(contextM88532i, (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC38079f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38079f.class), null), (InterfaceC3852c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC3852c.class), null), (C40191e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (InterfaceC2286b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2286b.class), null), (C40195i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40195i.class), null), (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final C4272a m103486G2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4272a((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final boolean m103487G3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public static final InterfaceC2285a m103488G4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33012b((InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC38652a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC38652a.class), null), (C33013c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C33013c.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final C27721s m103492H2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        NotificationRepository notificationRepository = (NotificationRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null);
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C27721s(interfaceC31766c, featureFlagChecker, notificationRepository, AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, ExecutorC22364d.f87316w)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final AnalyticsUserRepository m103493H3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AnalyticsUserRepository.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public static final InterfaceC17346e m103494H4(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        ComponentCallbacks2 componentCallbacks2M88531h = AbstractC29125c.m88531h(single);
        AbstractC22676k.m65748h(componentCallbacks2M88531h, "null cannot be cast to non-null type com.whoop.base.ApplicationLifecycleListener");
        return (InterfaceC17346e) componentCallbacks2M88531h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final C27702f0 m103498I2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27702f0((C27721s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27721s.class), null), (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (InterfaceC37639b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37639b.class), null), (C37638a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37638a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public static final InterfaceC37225i m103499I3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C40190d(new C28049b(single, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final C35199a m103500I4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        InterfaceC34108f interfaceC34108fLogEventsDao = ((WhoopDatabase) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).logEventsDao();
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C35199a(interfaceC2994c0, interfaceC34108fLogEventsDao, ExecutorC22364d.f87316w, AbstractC17182o.f65999a, (InterfaceC34114l) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34114l.class), null), InterfaceC34116n.INSTANCE.m107848a("LocalLogExporter"), (C32052a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C32052a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), new C10604o(), new C35201c(), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), null, DfuBaseService.ERROR_CONNECTION_MASK, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final C36309b m103504J2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36309b(((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).logEventsDao(), (AppExecutors) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppExecutors.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C34112j) single.m122602a(new C32223d(5), c22673i0.getOrCreateKotlinClass(C34112j.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final InterfaceC40188b m103505J3(C38266c c38266c) {
        return (InterfaceC40188b) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J4 */
    public static final InterfaceC41070a m103506J4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C41072c(new C32581a1(24), new C32581a1(25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final C34911a m103510K2() {
        return AbstractC15751g.m44431K(DateTimeFormatter.ofPattern("M-d-yyyy H:mm:ss.SSSZ"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final C32052a m103511K3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C32052a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K4 */
    public static final long m103512K4() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final C27705h m103516L2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27705h((C27721s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27721s.class), null), (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final C40196j m103517L3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C40196j((C34660d) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final DateTimeZone m103518L4() {
        DateTimeZone dateTimeZone = DateTimeZone.getDefault();
        AbstractC22676k.m65749i(dateTimeZone, "getDefault(...)");
        return dateTimeZone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final C27707i m103522M2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27707i((C27721s) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27721s.class), null), (Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (C26813a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26813a.class), null), (InterfaceC16182d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC16182d.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final C38076c m103523M3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C38076c(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public static final C28204u m103524M4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28204u((InterfaceC41070a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final C9993e m103528N2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9993e((Context) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(Context.class), null), (InterfaceC13596a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC13596a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (C35234a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35234a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, null, 192, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final C29163a m103529N3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C29163a(AbstractC29125c.m88532i(factory));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N4 */
    public static final C28143a m103530N4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28143a(AbstractC29125c.m88532i(factory), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final C9984a m103534O2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C9984a((InterfaceC3852c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC3852c.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final boolean m103535O3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final C17029a m103536O4(C38266c c38266c, C34911a c34911a) {
        String string = AbstractC2875y.m8292e(c38266c, "$this$factory", c34911a, "it", c38266c).getString(AbstractC17312j.f67022s1);
        AbstractC22676k.m65749i(string, "getString(...)");
        return new C17029a(null, null, string, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final C32225f m103540P2(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Context contextM88532i = AbstractC29125c.m88532i(factory);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C32225f(contextM88532i, (C27843f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27843f.class), null), InterfaceC34116n.INSTANCE.m107848a("RealTimeActivitySync"), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC3852c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC3852c.class), null), (InterfaceC24882a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC24882a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final PreferenceHelper m103541P3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("mainPrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new PreferenceHelper((C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("featureFlagPrefs")), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("languagePrefs")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P4 */
    public static final C23359a m103542P4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C23359a((AbstractC21909c) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final InterfaceC39736a m103546Q2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39737b(null, (InterfaceC0422g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final C30076h m103547Q3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("bleWhoopStrapServicePrefs");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30076h((C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), c35953c), (C4329a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final C26486h m103548Q4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26486h((InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final C36157b m103552R2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36157b((C14208u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14208u.class), null), (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null), AbstractC17307e.f66562D2, AbstractC17307e.f66568E2, (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final InterfaceC4733b m103553R3(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("WhoopStrapProviderImpl");
        Context contextM88532i = AbstractC29125c.m88532i(single);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C14288a(interfaceC34116nM107848a, contextM88532i, (C30076h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), ((Boolean) single.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), new C35953c("testFlag"))).booleanValue(), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 64, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final InterfaceC17362u m103557S2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C17363v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public static final C12446b m103558S3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C12446b((AbstractC21909c) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T2 */
    public static final C21167s0 m103562T2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21167s0((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final InterfaceC4372l m103563T3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C10019a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final Intent m103567U2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return new Intent((Context) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Context.class)), (Class<?>) BleChooseStrapActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public static final C26480b m103568U3(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(factory);
        AbstractC22676k.m65748h(applicationM88531h, "null cannot be cast to non-null type com.whoop.WhoopApplication");
        WhoopApplication whoopApplication = (WhoopApplication) applicationM88531h;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C26480b(whoopApplication, (C40191e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (C11059g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null), (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (C28216y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28216y.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), (InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC39700a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39700a.class), null), null, null, null, 14336, null);
    }

    /* JADX INFO: renamed from: V1 */
    private static final C23454a0 m103571V1(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        final int i13 = 10;
        C30330b c30330b = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34107e.class), null, new C32446a(i13), 1);
        C31365d c31365dM8311x = AbstractC2875y.m8311x(c30330b, module, AbstractC21598x.m60669Y(c30330b.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz = AbstractC22671h0.m65688a(InterfaceC34116n.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b2 = c31365dM8311x.f129023a;
        c30330b2.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b2.f124475f);
        String strM60669Y = AbstractC21598x.m60669Y(clazz, c30330b2.f124472c, c30330b2.f124470a);
        final int i14 = 1;
        module.m106774b(strM60669Y, c31365dM8311x, true);
        final int i15 = 6;
        C30330b c30330b3 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34103a.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b3, module, AbstractC21598x.m60669Y(c30330b3.m92688a(), null, AbstractC35846d.m113782g())));
        final int i16 = 18;
        C30330b c30330b4 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34106d.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b4, module, AbstractC21598x.m60669Y(c30330b4.m92688a(), null, AbstractC35846d.m113782g())));
        C35953c c35953cM114198f = AbstractC35952b.m114198f("workManagerInstance");
        final int i17 = 0;
        C30330b c30330b5 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(AbstractC18377p0.class), c35953cM114198f, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b5, module, AbstractC21598x.m60669Y(c30330b5.m92688a(), c35953cM114198f, AbstractC35846d.m113782g())));
        final int i18 = 12;
        C30330b c30330b6 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C30844a.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b6, module, AbstractC21598x.m60669Y(c30330b6.m92688a(), null, AbstractC35846d.m113782g())));
        final int i19 = 24;
        C30330b c30330b7 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C32052a.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b7, module, AbstractC21598x.m60669Y(c30330b7.m92688a(), null, AbstractC35846d.m113782g())));
        final int i24 = 17;
        C30330b c30330b8 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C17708d.class), null, new C32446a(i24), 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b8, module, AbstractC21598x.m60669Y(c30330b8.m92688a(), null, AbstractC35846d.m113782g())));
        final int i25 = 29;
        C30330b c30330b9 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC38652a.class), null, new C32446a(i25), 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b9, module, AbstractC21598x.m60669Y(c30330b9.m92688a(), null, AbstractC35846d.m113782g())));
        final int i26 = 11;
        C30330b c30330b10 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C33267a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b10, module, AbstractC21598x.m60669Y(c30330b10.m92688a(), null, AbstractC35846d.m113782g())));
        final int i27 = 23;
        C30330b c30330b11 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C10923a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b11, module, AbstractC21598x.m60669Y(c30330b11.m92688a(), null, AbstractC35846d.m113782g())));
        final int i28 = 2;
        C30330b c30330b12 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(BluetoothAdapter.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b12), false);
        final int i29 = 4;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g = AbstractC35846d.m113782g();
        C30330b c30330b13 = new C30330b(c35953cM113782g, AbstractC22671h0.m65688a(C34112j.class), null, interfaceC4351m, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.m92688a(), null, c35953cM113782g), new C31362a(c30330b13), false);
        final int i34 = 16;
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g2 = AbstractC35846d.m113782g();
        C30330b c30330b14 = new C30330b(c35953cM113782g2, AbstractC22671h0.m65688a(C24506a.class), null, interfaceC4351m2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.m92688a(), null, c35953cM113782g2), new C31362a(c30330b14), false);
        final int i35 = 28;
        C30330b c30330b15 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C36309b.class), null, new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b15), false);
        C30330b c30330b16 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC36310c.class), null, new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b16), false);
        C30330b c30330b17 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC30845b.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b17), false);
        C30330b c30330b18 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC33268b.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b18), false);
        final int i36 = 2;
        C30330b c30330b19 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34658b.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x = AbstractC31061c.m95648x(c30330b19, module, AbstractC21598x.m60669Y(c30330b19.m92688a(), null, AbstractC35846d.m113782g()), "mainPrefs");
        final int i37 = 3;
        C30330b c30330b20 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34660d.class), c35953cM95648x, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x2 = AbstractC31061c.m95648x(c30330b20, module, AbstractC21598x.m60669Y(c30330b20.m92688a(), c35953cM95648x, AbstractC35846d.m113782g()), "featureFlagPrefs");
        final int i38 = 5;
        C30330b c30330b21 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34660d.class), c35953cM95648x2, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x3 = AbstractC31061c.m95648x(c30330b21, module, AbstractC21598x.m60669Y(c30330b21.m92688a(), c35953cM95648x2, AbstractC35846d.m113782g()), "bleWhoopStrapServicePrefs");
        final int i39 = 7;
        C30330b c30330b22 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34660d.class), c35953cM95648x3, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x4 = AbstractC31061c.m95648x(c30330b22, module, AbstractC21598x.m60669Y(c30330b22.m92688a(), c35953cM95648x3, AbstractC35846d.m113782g()), "languagePrefs");
        final int i44 = 8;
        C30330b c30330b23 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34660d.class), c35953cM95648x4, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x5 = AbstractC31061c.m95648x(c30330b23, module, AbstractC21598x.m60669Y(c30330b23.m92688a(), c35953cM95648x4, AbstractC35846d.m113782g()), "strainCoachPrefs");
        final int i45 = 9;
        C30330b c30330b24 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34660d.class), c35953cM95648x5, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.m92688a(), c35953cM95648x5, AbstractC35846d.m113782g()), new C31365d(c30330b24), false);
        C30330b c30330b25 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25327j.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b25, module, AbstractC21598x.m60669Y(c30330b25.m92688a(), null, AbstractC35846d.m113782g())));
        C30330b c30330b26 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C40191e.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x6 = AbstractC31061c.m95648x(c30330b26, module, AbstractC21598x.m60669Y(c30330b26.m92688a(), null, AbstractC35846d.m113782g()), "userContext");
        C30330b c30330b27 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C27858u.class), c35953cM95648x6, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b27, module, AbstractC21598x.m60669Y(c30330b27.m92688a(), c35953cM95648x6, AbstractC35846d.m113782g())));
        final int i46 = 13;
        C30330b c30330b28 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28217y0.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b28.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b28), false);
        final int i47 = 14;
        C30330b c30330b29 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28210w.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b29), false);
        C30330b c30330b30 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C0589a.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b30), false);
        C30330b c30330b31 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28150c.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b31), false);
        final int i48 = 19;
        C30330b c30330b32 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(BatteryManager.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b32), false);
        final int i49 = 20;
        C30330b c30330b33 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(PowerManager.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b33.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b33), false);
        final int i54 = 21;
        C30330b c30330b34 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(AppExecutors.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b34), false);
        final int i55 = 22;
        C30330b c30330b35 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C27861x.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b35), false);
        final int i56 = 23;
        C30330b c30330b36 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC28172j0.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b36), false);
        final int i57 = 24;
        C30330b c30330b37 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC18732d.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b37), false);
        final int i58 = 25;
        C30330b c30330b38 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C6050a.class), null, new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b38.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b38), false);
        final int i59 = 27;
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i59) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g3 = AbstractC35846d.m113782g();
        C30330b c30330b39 = new C30330b(c35953cM113782g3, AbstractC22671h0.m65688a(C38075b.class), null, interfaceC4351m3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b39.m92688a(), null, c35953cM113782g3), new C31362a(c30330b39), false);
        final int i64 = 28;
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i64) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g4 = AbstractC35846d.m113782g();
        C30330b c30330b40 = new C30330b(c35953cM113782g4, AbstractC22671h0.m65688a(InterfaceC38079f.class), null, interfaceC4351m4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b40.m92688a(), null, c35953cM113782g4), new C31362a(c30330b40), false);
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        final int i65 = 27;
        C30330b c30330b41 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C33706d.class), null, interfaceC4351m5, 1);
        C31365d c31365dM8311x2 = AbstractC2875y.m8311x(c30330b41, module, AbstractC21598x.m60669Y(c30330b41.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz2 = AbstractC22671h0.m65688a(InterfaceC33704b.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b42 = c31365dM8311x2.f129023a;
        c30330b42.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b42.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b42.f124472c, c30330b42.f124470a), c31365dM8311x2, true);
        C30330b c30330b43 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC15574a.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b43.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b43), false);
        final int i66 = 2;
        C30330b c30330b44 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC14252c.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i66) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b44.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b44), false);
        final int i67 = 3;
        C30330b c30330b45 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34791a.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i67) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x3 = AbstractC2875y.m8311x(c30330b45, module, AbstractC21598x.m60669Y(c30330b45.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz3 = AbstractC22671h0.m65688a(InterfaceC2804a.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b46 = c31365dM8311x3.f129023a;
        c30330b46.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b46.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b46.f124472c, c30330b46.f124470a), c31365dM8311x3, true);
        final int i68 = 4;
        C30330b c30330b47 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C39344g.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i68) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b47.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b47), false);
        final int i69 = 5;
        C30330b c30330b48 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C4329a.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i69) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x7 = AbstractC31061c.m95648x(c30330b48, module, AbstractC21598x.m60669Y(c30330b48.m92688a(), null, AbstractC35846d.m113782g()), "testPause");
        final int i74 = 6;
        C30330b c30330b49 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(Long.class), c35953cM95648x7, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i74) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x8 = AbstractC31061c.m95648x(c30330b49, module, AbstractC21598x.m60669Y(c30330b49.m92688a(), c35953cM95648x7, AbstractC35846d.m113782g()), "bluetoothSyncManagerDelay");
        final int i75 = 8;
        C30330b c30330b50 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(Long.class), c35953cM95648x8, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i75) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x9 = AbstractC31061c.m95648x(c30330b50, module, AbstractC21598x.m60669Y(c30330b50.m92688a(), c35953cM95648x8, AbstractC35846d.m113782g()), "testFlag");
        final int i76 = 9;
        C30330b c30330b51 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(Boolean.class), c35953cM95648x9, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i76) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b51.m92688a(), c35953cM95648x9, AbstractC35846d.m113782g()), new C31365d(c30330b51), false);
        C30330b c30330b52 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(AnalyticsUserRepository.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b52.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b52), false);
        C30330b c30330b53 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC37225i.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b53.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b53), false);
        C30330b c30330b54 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C40196j.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b54.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b54), false);
        C30330b c30330b55 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C38076c.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b55.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b55), false);
        final int i77 = 15;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g5 = AbstractC35846d.m113782g();
        C30330b c30330b56 = new C30330b(c35953cM113782g5, AbstractC22671h0.m65688a(C29163a.class), null, interfaceC4351m6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b56.m92688a(), null, c35953cM113782g5), new C31362a(c30330b56), false);
        C35953c c35953cM114198f2 = AbstractC35952b.m114198f("connectivityTipPopUpEnabled");
        C30330b c30330b57 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(Boolean.class), c35953cM114198f2, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b57.m92688a(), c35953cM114198f2, AbstractC35846d.m113782g()), new C31365d(c30330b57), false);
        C30330b c30330b58 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(PreferenceHelper.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b58.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b58), false);
        final int i78 = 19;
        C30330b c30330b59 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C30076h.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b59.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b59), false);
        final int i79 = 20;
        C30330b c30330b60 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC4733b.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i79) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b60.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b60), false);
        final int i83 = 21;
        C30330b c30330b61 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C12446b.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i83) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b61.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b61), false);
        final int i84 = 22;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g6 = AbstractC35846d.m113782g();
        C30330b c30330b62 = new C30330b(c35953cM113782g6, AbstractC22671h0.m65688a(InterfaceC4372l.class), null, interfaceC4351m7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b62.m92688a(), null, c35953cM113782g6), new C31362a(c30330b62), false);
        final int i85 = 23;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i85) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g7 = AbstractC35846d.m113782g();
        C30330b c30330b63 = new C30330b(c35953cM113782g7, AbstractC22671h0.m65688a(C26480b.class), null, interfaceC4351m8, 2);
        String strM60669Y2 = AbstractC21598x.m60669Y(c30330b63.m92688a(), null, c35953cM113782g7);
        C31362a c31362a = new C31362a(c30330b63);
        module.m106774b(strM60669Y2, c31362a, false);
        InterfaceC21461d clazz4 = AbstractC22671h0.m65688a(InterfaceC5384x.class);
        AbstractC22676k.m65750j(clazz4, "clazz");
        C30330b c30330b64 = c31362a.f129023a;
        c30330b64.f124475f = AbstractC25265s.m74128f1(clazz4, (Collection) c30330b64.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz4, c30330b64.f124472c, c30330b64.f124470a), c31362a, true);
        final int i86 = 25;
        C30330b c30330b65 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC15606b.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i86) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b65.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b65), false);
        final int i87 = 26;
        C30330b c30330b66 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC11114b.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i87) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b66.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b66), false);
        C30330b c30330b67 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C9985b.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i65) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b67.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b67), false);
        final int i88 = 28;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i88) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g8 = AbstractC35846d.m113782g();
        C30330b c30330b68 = new C30330b(c35953cM113782g8, AbstractC22671h0.m65688a(C27710j0.class), null, interfaceC4351m9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b68.m92688a(), null, c35953cM113782g8), new C31362a(c30330b68), false);
        C32446a c32446a = new C32446a(i26);
        C35953c c35953cM113782g9 = AbstractC35846d.m113782g();
        C30330b c30330b69 = new C30330b(c35953cM113782g9, AbstractC22671h0.m65688a(C27696c0.class), null, c32446a, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b69.m92688a(), null, c35953cM113782g9), new C31362a(c30330b69), false);
        C32446a c32446a2 = new C32446a(12);
        C35953c c35953cM113782g10 = AbstractC35846d.m113782g();
        C30330b c30330b70 = new C30330b(c35953cM113782g10, AbstractC22671h0.m65688a(C40197k.class), null, c32446a2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b70.m92688a(), null, c35953cM113782g10), new C31362a(c30330b70), false);
        C32446a c32446a3 = new C32446a(i46);
        C35953c c35953cM113782g11 = AbstractC35846d.m113782g();
        C30330b c30330b71 = new C30330b(c35953cM113782g11, AbstractC22671h0.m65688a(C40193g.class), null, c32446a3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b71.m92688a(), null, c35953cM113782g11), new C31362a(c30330b71), false);
        C30330b c30330b72 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28216y.class), null, new C32446a(i47), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b72.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b72), false);
        C30330b c30330b73 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28159f.class), null, new C32446a(i77), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b73.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b73), false);
        C30330b c30330b74 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25561a.class), null, new C32446a(i34), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b74.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b74), false);
        C32446a c32446a4 = new C32446a(18);
        C35953c c35953cM113782g12 = AbstractC35846d.m113782g();
        C30330b c30330b75 = new C30330b(c35953cM113782g12, AbstractC22671h0.m65688a(C36484a.class), null, c32446a4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b75.m92688a(), null, c35953cM113782g12), new C31362a(c30330b75), false);
        C30330b c30330b76 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC3288d.class), null, new C32446a(i78), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b76.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b76), false);
        final int i89 = 20;
        C30330b c30330b77 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C36967b.class), null, new C32446a(i89), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b77.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b77), false);
        C32446a c32446a5 = new C32446a(i84);
        C35953c c35953cM113782g13 = AbstractC35846d.m113782g();
        C30330b c30330b78 = new C30330b(c35953cM113782g13, AbstractC22671h0.m65688a(InterfaceC25949a.class), null, c32446a5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b78.m92688a(), null, c35953cM113782g13), new C31362a(c30330b78), false);
        C32446a c32446a6 = new C32446a(23);
        C35953c c35953cM113782g14 = AbstractC35846d.m113782g();
        C30330b c30330b79 = new C30330b(c35953cM113782g14, AbstractC22671h0.m65688a(C26481c.class), null, c32446a6, 2);
        String strM60669Y3 = AbstractC21598x.m60669Y(c30330b79.m92688a(), null, c35953cM113782g14);
        C31362a c31362a2 = new C31362a(c30330b79);
        module.m106774b(strM60669Y3, c31362a2, false);
        InterfaceC21461d clazz5 = AbstractC22671h0.m65688a(InterfaceC5385x0.class);
        AbstractC22676k.m65750j(clazz5, "clazz");
        C30330b c30330b80 = c31362a2.f129023a;
        c30330b80.f124475f = AbstractC25265s.m74128f1(clazz5, (Collection) c30330b80.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz5, c30330b80.f124472c, c30330b80.f124470a), c31362a2, true);
        C32446a c32446a7 = new C32446a(24);
        C35953c c35953cM113782g15 = AbstractC35846d.m113782g();
        C30330b c30330b81 = new C30330b(c35953cM113782g15, AbstractC22671h0.m65688a(C26482d.class), null, c32446a7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b81.m92688a(), null, c35953cM113782g15), new C31362a(c30330b81), false);
        C30330b c30330b82 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC2994c0.class), null, new C32446a(25), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b82.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b82), false);
        C32446a c32446a8 = new C32446a(26);
        C35953c c35953cM113782g16 = AbstractC35846d.m113782g();
        C30330b c30330b83 = new C30330b(c35953cM113782g16, AbstractC22671h0.m65688a(InterfaceC15825a.class), null, c32446a8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b83.m92688a(), null, c35953cM113782g16), new C31362a(c30330b83), false);
        C30330b c30330b84 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC14457c.class), null, new C32446a(i65), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b84.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b84), false);
        C32446a c32446a9 = new C32446a(28);
        C35953c c35953cM113782g17 = AbstractC35846d.m113782g();
        C30330b c30330b85 = new C30330b(c35953cM113782g17, AbstractC22671h0.m65688a(C4362b.class), null, c32446a9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b85.m92688a(), null, c35953cM113782g17), new C31362a(c30330b85), false);
        final int i94 = 0;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i94) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g18 = AbstractC35846d.m113782g();
        C30330b c30330b86 = new C30330b(c35953cM113782g18, AbstractC22671h0.m65688a(C33709g.class), null, interfaceC4351m10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b86.m92688a(), null, c35953cM113782g18), new C31362a(c30330b86), false);
        final int i95 = 1;
        C30330b c30330b87 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C28183n.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i95) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x4 = AbstractC2875y.m8311x(c30330b87, module, AbstractC21598x.m60669Y(c30330b87.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz6 = AbstractC22671h0.m65688a(InterfaceC28186o.class);
        AbstractC22676k.m65750j(clazz6, "clazz");
        C30330b c30330b88 = c31365dM8311x4.f129023a;
        c30330b88.f124475f = AbstractC25265s.m74128f1(clazz6, (Collection) c30330b88.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz6, c30330b88.f124472c, c30330b88.f124470a), c31365dM8311x4, true);
        final int i96 = 3;
        C30330b c30330b89 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31245d.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i96) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b89.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b89), false);
        final int i97 = 4;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i97) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g19 = AbstractC35846d.m113782g();
        C30330b c30330b90 = new C30330b(c35953cM113782g19, AbstractC22671h0.m65688a(C29020i.class), null, interfaceC4351m11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b90.m92688a(), null, c35953cM113782g19), new C31362a(c30330b90), false);
        final int i98 = 5;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i98) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g20 = AbstractC35846d.m113782g();
        C30330b c30330b91 = new C30330b(c35953cM113782g20, AbstractC22671h0.m65688a(C29019h.class), null, interfaceC4351m12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b91.m92688a(), null, c35953cM113782g20), new C31362a(c30330b91), false);
        C35953c c35953cM114198f3 = AbstractC35952b.m114198f("streamClient");
        final int i99 = 6;
        C30330b c30330b92 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC12284b.class), c35953cM114198f3, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i99) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x10 = AbstractC31061c.m95648x(c30330b92, module, AbstractC21598x.m60669Y(c30330b92.m92688a(), c35953cM114198f3, AbstractC35846d.m113782g()), "STREAM_VIDEO_CALL_KEY");
        final int i100 = 7;
        C30330b c30330b93 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(String.class), c35953cM95648x10, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i100) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b93.m92688a(), c35953cM95648x10, AbstractC35846d.m113782g()), new C31365d(c30330b93), false);
        final int i101 = 8;
        C30330b c30330b94 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(ChatClient.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i101) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b94.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b94), false);
        final int i102 = 9;
        C30330b c30330b95 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C4335g.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i102) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x5 = AbstractC2875y.m8311x(c30330b95, module, AbstractC21598x.m60669Y(c30330b95.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d[] interfaceC21461dArr = {AbstractC22671h0.m65688a(InterfaceC32957a.class)};
        C30330b c30330b96 = c31365dM8311x5.f129023a;
        c30330b96.f124475f = AbstractC25265s.m74130h1((Collection) c30330b96.f124475f, interfaceC21461dArr);
        for (InterfaceC21461d interfaceC21461d : interfaceC21461dArr) {
            module.m106774b(AbstractC21598x.m60669Y(interfaceC21461d, c30330b96.f124472c, c30330b96.f124470a), c31365dM8311x5, true);
        }
        final int i103 = 10;
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i103) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g21 = AbstractC35846d.m113782g();
        C30330b c30330b97 = new C30330b(c35953cM113782g21, AbstractC22671h0.m65688a(InterfaceC29333c.class), null, interfaceC4351m13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b97.m92688a(), null, c35953cM113782g21), new C31362a(c30330b97), false);
        final int i104 = 12;
        C30330b c30330b98 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C38082i.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i104) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b98, module, AbstractC21598x.m60669Y(c30330b98.m92688a(), null, AbstractC35846d.m113782g())));
        C30330b c30330b99 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC2285a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b99, module, AbstractC21598x.m60669Y(c30330b99.m92688a(), null, AbstractC35846d.m113782g())));
        C30330b c30330b100 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC17346e.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b100.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b100), false);
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g22 = AbstractC35846d.m113782g();
        C30330b c30330b101 = new C30330b(c35953cM113782g22, AbstractC22671h0.m65688a(C35199a.class), null, interfaceC4351m14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b101.m92688a(), null, c35953cM113782g22), new C31362a(c30330b101), false);
        final int i105 = 17;
        InterfaceC4351m interfaceC4351m15 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i105) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g23 = AbstractC35846d.m113782g();
        C30330b c30330b102 = new C30330b(c35953cM113782g23, AbstractC22671h0.m65688a(InterfaceC41070a.class), null, interfaceC4351m15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b102.m92688a(), null, c35953cM113782g23), new C31362a(c30330b102), false);
        final int i106 = 18;
        InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i106) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g24 = AbstractC35846d.m113782g();
        C30330b c30330b103 = new C30330b(c35953cM113782g24, AbstractC22671h0.m65688a(C28204u.class), null, interfaceC4351m16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b103.m92688a(), null, c35953cM113782g24), new C31362a(c30330b103), false);
        InterfaceC4351m interfaceC4351m17 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g25 = AbstractC35846d.m113782g();
        C30330b c30330b104 = new C30330b(c35953cM113782g25, AbstractC22671h0.m65688a(C28143a.class), null, interfaceC4351m17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b104.m92688a(), null, c35953cM113782g25), new C31362a(c30330b104), false);
        InterfaceC4351m interfaceC4351m18 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i89) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g26 = AbstractC35846d.m113782g();
        C30330b c30330b105 = new C30330b(c35953cM113782g26, AbstractC22671h0.m65688a(C17029a.class), null, interfaceC4351m18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b105.m92688a(), null, c35953cM113782g26), new C31362a(c30330b105), false);
        final int i107 = 21;
        C30330b c30330b106 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C23359a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i107) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b106.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b106), false);
        InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g27 = AbstractC35846d.m113782g();
        C30330b c30330b107 = new C30330b(c35953cM113782g27, AbstractC22671h0.m65688a(C26486h.class), null, interfaceC4351m19, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b107.m92688a(), null, c35953cM113782g27), new C31362a(c30330b107), false);
        final int i108 = 1;
        InterfaceC4351m interfaceC4351m20 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i108) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g28 = AbstractC35846d.m113782g();
        C30330b c30330b108 = new C30330b(c35953cM113782g28, AbstractC22671h0.m65688a(InterfaceC26483e.class), null, interfaceC4351m20, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b108.m92688a(), null, c35953cM113782g28), new C31362a(c30330b108), false);
        final int i109 = 12;
        InterfaceC4351m interfaceC4351m21 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i109) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g29 = AbstractC35846d.m113782g();
        C30330b c30330b109 = new C30330b(c35953cM113782g29, AbstractC22671h0.m65688a(C28162g.class), null, interfaceC4351m21, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b109.m92688a(), null, c35953cM113782g29), new C31362a(c30330b109), false);
        final int i110 = 23;
        InterfaceC4351m interfaceC4351m22 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i110) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g30 = AbstractC35846d.m113782g();
        C30330b c30330b110 = new C30330b(c35953cM113782g30, AbstractC22671h0.m65688a(C10270c.class), null, interfaceC4351m22, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b110.m92688a(), null, c35953cM113782g30), new C31362a(c30330b110), false);
        final int i111 = 4;
        InterfaceC4351m interfaceC4351m23 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i111) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g31 = AbstractC35846d.m113782g();
        C30330b c30330b111 = new C30330b(c35953cM113782g31, AbstractC22671h0.m65688a(C36156a.class), null, interfaceC4351m23, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b111.m92688a(), null, c35953cM113782g31), new C31362a(c30330b111), false);
        InterfaceC4351m interfaceC4351m24 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g32 = AbstractC35846d.m113782g();
        C30330b c30330b112 = new C30330b(c35953cM113782g32, AbstractC22671h0.m65688a(C36161f.class), null, interfaceC4351m24, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b112.m92688a(), null, c35953cM113782g32), new C31362a(c30330b112), false);
        final int i112 = 26;
        InterfaceC4351m interfaceC4351m25 = new InterfaceC4351m() { // from class: sr2.d
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i112) {
                    case 0:
                        return C32924f.m103577W2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103582X2(c38266c, c34911a);
                    case 2:
                        return C32924f.m103587Y2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103592Z2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103615d2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103598a3(c38266c, c34911a);
                    case 6:
                        return C32924f.m103581X1(c38266c, c34911a);
                    case 7:
                        return C32924f.m103616d3(c38266c, c34911a);
                    case 8:
                        return C32924f.m103622e3(c38266c, c34911a);
                    case 9:
                        return C32924f.m103628f3(c38266c, c34911a);
                    case 10:
                        return C32924f.m103634g3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103640h3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103646i3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103652j3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103658k3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103621e2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103664l3(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103670m3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103604b3(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103682o3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103688p3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103694q3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103700r3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103706s3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103712t3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103718u3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103627f2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103724v3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103730w3(c38266c, c34911a);
                    default:
                        return C32924f.m103736x3(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g33 = AbstractC35846d.m113782g();
        C30330b c30330b113 = new C30330b(c35953cM113782g33, AbstractC22671h0.m65688a(C36168m.class), null, interfaceC4351m25, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b113.m92688a(), null, c35953cM113782g33), new C31362a(c30330b113), false);
        final int i113 = 7;
        InterfaceC4351m interfaceC4351m26 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i113) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g34 = AbstractC35846d.m113782g();
        C30330b c30330b114 = new C30330b(c35953cM113782g34, AbstractC22671h0.m65688a(C11818a.class), null, interfaceC4351m26, 2);
        String strM60669Y4 = AbstractC21598x.m60669Y(c30330b114.m92688a(), null, c35953cM113782g34);
        C31362a c31362a3 = new C31362a(c30330b114);
        module.m106774b(strM60669Y4, c31362a3, false);
        InterfaceC21461d clazz7 = AbstractC22671h0.m65688a(InterfaceC39700a.class);
        AbstractC22676k.m65750j(clazz7, "clazz");
        C30330b c30330b115 = c31362a3.f129023a;
        c30330b115.f124475f = AbstractC25265s.m74128f1(clazz7, (Collection) c30330b115.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz7, c30330b115.f124472c, c30330b115.f124470a), c31362a3, true);
        final int i114 = 18;
        InterfaceC4351m interfaceC4351m27 = new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i114) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g35 = AbstractC35846d.m113782g();
        C30330b c30330b116 = new C30330b(c35953cM113782g35, AbstractC22671h0.m65688a(InterfaceC21159o0.class), null, interfaceC4351m27, 2);
        String strM60669Y5 = AbstractC21598x.m60669Y(c30330b116.m92688a(), null, c35953cM113782g35);
        C31362a c31362a4 = new C31362a(c30330b116);
        module.m106774b(strM60669Y5, c31362a4, false);
        InterfaceC21461d clazz8 = AbstractC22671h0.m65688a(C36159d.class);
        AbstractC22676k.m65750j(clazz8, "clazz");
        C30330b c30330b117 = c31362a4.f129023a;
        c30330b117.f124475f = AbstractC25265s.m74128f1(clazz8, (Collection) c30330b117.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz8, c30330b117.f124472c, c30330b117.f124470a), c31362a4, true);
        final int i115 = 29;
        C30330b c30330b118 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C36165j.class), null, new InterfaceC4351m() { // from class: sr2.e
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i115) {
                    case 0:
                        return C32924f.m103676n3(c38266c, c34911a);
                    case 1:
                        return C32924f.m103748z3(c38266c, c34911a);
                    case 2:
                        return C32924f.m103451A3(c38266c, c34911a);
                    case 3:
                        return C32924f.m103457B3(c38266c, c34911a);
                    case 4:
                        return C32924f.m103463C3(c38266c, c34911a);
                    case 5:
                        return C32924f.m103469D3(c38266c, c34911a);
                    case 6:
                        return Long.valueOf(C32924f.m103475E3(c38266c, c34911a));
                    case 7:
                        return C32924f.m103633g2(c38266c, c34911a);
                    case 8:
                        return Long.valueOf(C32924f.m103481F3(c38266c, c34911a));
                    case 9:
                        return Boolean.valueOf(C32924f.m103487G3(c38266c, c34911a));
                    case 10:
                        return C32924f.m103493H3(c38266c, c34911a);
                    case 11:
                        return C32924f.m103499I3(c38266c, c34911a);
                    case 12:
                        return C32924f.m103742y3(c38266c, c34911a);
                    case 13:
                        return C32924f.m103517L3(c38266c, c34911a);
                    case 14:
                        return C32924f.m103523M3(c38266c, c34911a);
                    case 15:
                        return C32924f.m103529N3(c38266c, c34911a);
                    case 16:
                        return Boolean.valueOf(C32924f.m103535O3(c38266c, c34911a));
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103541P3(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103639h2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103547Q3(c38266c, c34911a);
                    case 20:
                        return C32924f.m103553R3(c38266c, c34911a);
                    case 21:
                        return C32924f.m103558S3(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103563T3(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103568U3(c38266c, c34911a);
                    case 24:
                        return C32924f.m103511K3(c38266c, c34911a);
                    case 25:
                        return C32924f.m103578W3(c38266c, c34911a);
                    case 26:
                        return C32924f.m103583X3(c38266c, c34911a);
                    case 27:
                        return C32924f.m103588Y3(c38266c, c34911a);
                    case 28:
                        return C32924f.m103599a4(c38266c, c34911a);
                    default:
                        return C32924f.m103651j2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b118.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b118), false);
        C32446a c32446a10 = new C32446a(i107);
        C35953c c35953cM113782g36 = AbstractC35846d.m113782g();
        C30330b c30330b119 = new C30330b(c35953cM113782g36, AbstractC22671h0.m65688a(C36167l.class), null, c32446a10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b119.m92688a(), null, c35953cM113782g36), new C31362a(c30330b119), false);
        final int i116 = 13;
        InterfaceC4351m interfaceC4351m28 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i116) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g37 = AbstractC35846d.m113782g();
        C30330b c30330b120 = new C30330b(c35953cM113782g37, AbstractC22671h0.m65688a(C21606a.class), null, interfaceC4351m28, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b120.m92688a(), null, c35953cM113782g37), new C31362a(c30330b120), false);
        final int i117 = 24;
        InterfaceC4351m interfaceC4351m29 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i117) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g38 = AbstractC35846d.m113782g();
        C30330b c30330b121 = new C30330b(c35953cM113782g38, AbstractC22671h0.m65688a(C39357a.class), null, interfaceC4351m29, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b121.m92688a(), null, c35953cM113782g38), new C31362a(c30330b121), false);
        final int i118 = 25;
        InterfaceC4351m interfaceC4351m30 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i118) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g39 = AbstractC35846d.m113782g();
        C30330b c30330b122 = new C30330b(c35953cM113782g39, AbstractC22671h0.m65688a(C12899c0.class), null, interfaceC4351m30, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b122.m92688a(), null, c35953cM113782g39), new C31362a(c30330b122), false);
        final int i119 = 26;
        C30330b c30330b123 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC24882a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i119) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b123.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b123), false);
        final int i120 = 27;
        C30330b c30330b124 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC24883b.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i120) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b124.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b124), false);
        final int i121 = 28;
        C30330b c30330b125 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC39338a.class), null, new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i121) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b125.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b125), false);
        final int i122 = 29;
        InterfaceC4351m interfaceC4351m31 = new InterfaceC4351m() { // from class: sr2.b
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i122) {
                    case 0:
                        return C32924f.m103713t4(c38266c, c34911a);
                    case 1:
                        return C32924f.m103719u4(c38266c, c34911a);
                    case 2:
                        return C32924f.m103586Y1(c38266c, c34911a);
                    case 3:
                        return C32924f.m103725v4(c38266c, c34911a);
                    case 4:
                        return C32924f.m103731w4(c38266c, c34911a);
                    case 5:
                        return C32924f.m103737x4(c38266c, c34911a);
                    case 6:
                        return C32924f.m103749z4(c38266c, c34911a);
                    case 7:
                        return C32924f.m103452A4(c38266c, c34911a);
                    case 8:
                        return C32924f.m103458B4(c38266c, c34911a);
                    case 9:
                        return C32924f.m103464C4(c38266c, c34911a);
                    case 10:
                        return C32924f.m103470D4(c38266c, c34911a);
                    case 11:
                        return C32924f.m103707s4(c38266c, c34911a);
                    case 12:
                        return C32924f.m103482F4(c38266c, c34911a);
                    case 13:
                        return C32924f.m103669m2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103488G4(c38266c, c34911a);
                    case 15:
                        return C32924f.m103494H4(c38266c, c34911a);
                    case 16:
                        return C32924f.m103500I4(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103506J4(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103524M4(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103530N4(c38266c, c34911a);
                    case 20:
                        return C32924f.m103536O4(c38266c, c34911a);
                    case 21:
                        return C32924f.m103542P4(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103548Q4(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103476E4(c38266c, c34911a);
                    case 24:
                        return C32924f.m103681o2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103693q2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103699r2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103705s2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103711t2(c38266c, c34911a);
                    default:
                        return C32924f.m103717u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g40 = AbstractC35846d.m113782g();
        C30330b c30330b126 = new C30330b(c35953cM113782g40, AbstractC22671h0.m65688a(InterfaceC30696d.class), null, interfaceC4351m31, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b126.m92688a(), null, c35953cM113782g40), new C31362a(c30330b126), false);
        C35953c c35953cM114198f4 = AbstractC35952b.m114198f("navigation mappers");
        final int i123 = 0;
        InterfaceC4351m interfaceC4351m32 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i123) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g41 = AbstractC35846d.m113782g();
        C30330b c30330b127 = new C30330b(c35953cM113782g41, AbstractC22671h0.m65688a(List.class), c35953cM114198f4, interfaceC4351m32, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b127.m92688a(), c35953cM114198f4, c35953cM113782g41), new C31362a(c30330b127), false);
        final int i124 = 2;
        InterfaceC4351m interfaceC4351m33 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i124) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g42 = AbstractC35846d.m113782g();
        C30330b c30330b128 = new C30330b(c35953cM113782g42, AbstractC22671h0.m65688a(InterfaceC27353d.class), null, interfaceC4351m33, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b128.m92688a(), null, c35953cM113782g42), new C31362a(c30330b128), false);
        final int i125 = 3;
        InterfaceC4351m interfaceC4351m34 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i125) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g43 = AbstractC35846d.m113782g();
        C30330b c30330b129 = new C30330b(c35953cM113782g43, AbstractC22671h0.m65688a(InterfaceC31775l.class), null, interfaceC4351m34, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b129.m92688a(), null, c35953cM113782g43), new C31362a(c30330b129), false);
        final int i126 = 5;
        InterfaceC4351m interfaceC4351m35 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i126) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g44 = AbstractC35846d.m113782g();
        C30330b c30330b130 = new C30330b(c35953cM113782g44, AbstractC22671h0.m65688a(C10602a.class), null, interfaceC4351m35, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b130.m92688a(), null, c35953cM113782g44), new C31362a(c30330b130), false);
        final int i127 = 6;
        InterfaceC4351m interfaceC4351m36 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i127) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g45 = AbstractC35846d.m113782g();
        C30330b c30330b131 = new C30330b(c35953cM113782g45, AbstractC22671h0.m65688a(C33954a.class), null, interfaceC4351m36, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b131.m92688a(), null, c35953cM113782g45), new C31362a(c30330b131), false);
        final int i128 = 7;
        InterfaceC4351m interfaceC4351m37 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i128) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g46 = AbstractC35846d.m113782g();
        C30330b c30330b132 = new C30330b(c35953cM113782g46, AbstractC22671h0.m65688a(C37391a.class), null, interfaceC4351m37, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b132.m92688a(), null, c35953cM113782g46), new C31362a(c30330b132), false);
        final int i129 = 8;
        InterfaceC4351m interfaceC4351m38 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i129) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g47 = AbstractC35846d.m113782g();
        C30330b c30330b133 = new C30330b(c35953cM113782g47, AbstractC22671h0.m65688a(C34104b.class), null, interfaceC4351m38, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b133.m92688a(), null, c35953cM113782g47), new C31362a(c30330b133), false);
        final int i130 = 9;
        InterfaceC4351m interfaceC4351m39 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i130) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g48 = AbstractC35846d.m113782g();
        C30330b c30330b134 = new C30330b(c35953cM113782g48, AbstractC22671h0.m65688a(C27839b0.class), null, interfaceC4351m39, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b134.m92688a(), null, c35953cM113782g48), new C31362a(c30330b134), false);
        final int i131 = 10;
        C30330b c30330b135 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C17343b.class), null, new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i131) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b135.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b135), false);
        final int i132 = 11;
        InterfaceC4351m interfaceC4351m40 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i132) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g49 = AbstractC35846d.m113782g();
        C30330b c30330b136 = new C30330b(c35953cM113782g49, AbstractC22671h0.m65688a(C40192f.class), null, interfaceC4351m40, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b136.m92688a(), null, c35953cM113782g49), new C31362a(c30330b136), false);
        final int i133 = 13;
        InterfaceC4351m interfaceC4351m41 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i133) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g50 = AbstractC35846d.m113782g();
        C30330b c30330b137 = new C30330b(c35953cM113782g50, AbstractC22671h0.m65688a(C4272a.class), null, interfaceC4351m41, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b137.m92688a(), null, c35953cM113782g50), new C31362a(c30330b137), false);
        InterfaceC4351m interfaceC4351m42 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g51 = AbstractC35846d.m113782g();
        C30330b c30330b138 = new C30330b(c35953cM113782g51, AbstractC22671h0.m65688a(C27721s.class), null, interfaceC4351m42, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b138.m92688a(), null, c35953cM113782g51), new C31362a(c30330b138), false);
        InterfaceC4351m interfaceC4351m43 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g52 = AbstractC35846d.m113782g();
        C30330b c30330b139 = new C30330b(c35953cM113782g52, AbstractC22671h0.m65688a(C27702f0.class), null, interfaceC4351m43, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b139.m92688a(), null, c35953cM113782g52), new C31362a(c30330b139), false);
        final int i134 = 17;
        InterfaceC4351m interfaceC4351m44 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i134) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g53 = AbstractC35846d.m113782g();
        C30330b c30330b140 = new C30330b(c35953cM113782g53, AbstractC22671h0.m65688a(C27705h.class), null, interfaceC4351m44, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b140.m92688a(), null, c35953cM113782g53), new C31362a(c30330b140), false);
        final int i135 = 18;
        InterfaceC4351m interfaceC4351m45 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i135) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g54 = AbstractC35846d.m113782g();
        C30330b c30330b141 = new C30330b(c35953cM113782g54, AbstractC22671h0.m65688a(C27707i.class), null, interfaceC4351m45, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b141.m92688a(), null, c35953cM113782g54), new C31362a(c30330b141), false);
        InterfaceC4351m interfaceC4351m46 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g55 = AbstractC35846d.m113782g();
        C30330b c30330b142 = new C30330b(c35953cM113782g55, AbstractC22671h0.m65688a(C9993e.class), null, interfaceC4351m46, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b142.m92688a(), null, c35953cM113782g55), new C31362a(c30330b142), false);
        InterfaceC4351m interfaceC4351m47 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i89) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g56 = AbstractC35846d.m113782g();
        C30330b c30330b143 = new C30330b(c35953cM113782g56, AbstractC22671h0.m65688a(C9984a.class), null, interfaceC4351m47, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b143.m92688a(), null, c35953cM113782g56), new C31362a(c30330b143), false);
        InterfaceC4351m interfaceC4351m48 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i107) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g57 = AbstractC35846d.m113782g();
        C30330b c30330b144 = new C30330b(c35953cM113782g57, AbstractC22671h0.m65688a(C32225f.class), null, interfaceC4351m48, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b144.m92688a(), null, c35953cM113782g57), new C31362a(c30330b144), false);
        InterfaceC4351m interfaceC4351m49 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g58 = AbstractC35846d.m113782g();
        C30330b c30330b145 = new C30330b(c35953cM113782g58, AbstractC22671h0.m65688a(InterfaceC39736a.class), null, interfaceC4351m49, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b145.m92688a(), null, c35953cM113782g58), new C31362a(c30330b145), false);
        final int i136 = 24;
        InterfaceC4351m interfaceC4351m50 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i136) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g59 = AbstractC35846d.m113782g();
        C30330b c30330b146 = new C30330b(c35953cM113782g59, AbstractC22671h0.m65688a(C36157b.class), null, interfaceC4351m50, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b146.m92688a(), null, c35953cM113782g59), new C31362a(c30330b146), false);
        InterfaceC4351m interfaceC4351m51 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i118) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g60 = AbstractC35846d.m113782g();
        C30330b c30330b147 = new C30330b(c35953cM113782g60, AbstractC22671h0.m65688a(InterfaceC17362u.class), null, interfaceC4351m51, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b147.m92688a(), null, c35953cM113782g60), new C31362a(c30330b147), false);
        final int i137 = 26;
        InterfaceC4351m interfaceC4351m52 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i137) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g61 = AbstractC35846d.m113782g();
        C30330b c30330b148 = new C30330b(c35953cM113782g61, AbstractC22671h0.m65688a(C21167s0.class), null, interfaceC4351m52, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b148.m92688a(), null, c35953cM113782g61), new C31362a(c30330b148), false);
        C35953c c35953cM114198f5 = AbstractC35952b.m114198f("CONNECTIVITY_PAIRING_FLOW_INTENT");
        final int i138 = 27;
        InterfaceC4351m interfaceC4351m53 = new InterfaceC4351m() { // from class: sr2.c
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i138) {
                    case 0:
                        return C32924f.m103723v2(c38266c, c34911a);
                    case 1:
                        return C32924f.m103591Z1(c38266c, c34911a);
                    case 2:
                        return C32924f.m103729w2(c38266c, c34911a);
                    case 3:
                        return C32924f.m103735x2(c38266c, c34911a);
                    case 4:
                        return C32924f.m103663l2(c38266c, c34911a);
                    case 5:
                        return C32924f.m103747z2(c38266c, c34911a);
                    case 6:
                        return C32924f.m103450A2(c38266c, c34911a);
                    case 7:
                        return C32924f.m103456B2(c38266c, c34911a);
                    case 8:
                        return C32924f.m103462C2(c38266c, c34911a);
                    case 9:
                        return C32924f.m103468D2(c38266c, c34911a);
                    case 10:
                        return C32924f.m103474E2(c38266c, c34911a);
                    case 11:
                        return C32924f.m103480F2(c38266c, c34911a);
                    case 12:
                        return C32924f.m103597a2(c38266c, c34911a);
                    case 13:
                        return C32924f.m103486G2(c38266c, c34911a);
                    case 14:
                        return C32924f.m103492H2(c38266c, c34911a);
                    case 15:
                        return C32924f.m103498I2(c38266c, c34911a);
                    case 16:
                        return C32924f.m103741y2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C32924f.m103516L2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C32924f.m103522M2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C32924f.m103528N2(c38266c, c34911a);
                    case 20:
                        return C32924f.m103534O2(c38266c, c34911a);
                    case 21:
                        return C32924f.m103540P2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C32924f.m103546Q2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C32924f.m103603b2(c38266c, c34911a);
                    case 24:
                        return C32924f.m103552R2(c38266c, c34911a);
                    case 25:
                        return C32924f.m103557S2(c38266c, c34911a);
                    case 26:
                        return C32924f.m103562T2(c38266c, c34911a);
                    case 27:
                        return C32924f.m103567U2(c38266c, c34911a);
                    case 28:
                        return C32924f.m103504J2(c38266c, c34911a);
                    default:
                        return C32924f.m103572V2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g62 = AbstractC35846d.m113782g();
        C30330b c30330b149 = new C30330b(c35953cM113782g62, AbstractC22671h0.m65688a(Intent.class), c35953cM114198f5, interfaceC4351m53, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b149.m92688a(), c35953cM114198f5, c35953cM113782g62), new C31362a(c30330b149), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final InterfaceC36310c m103572V2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC34108f interfaceC34108fLogEventsDao = ((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).logEventsDao();
        ConsolePacketsApi consolePacketsApi = (ConsolePacketsApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(ConsolePacketsApi.class), null);
        C36312e c36312e = (C36312e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36312e.class), null);
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        AbstractC21909c abstractC21909c = (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null);
        C28185n1 c28185n1 = C28185n1.f113906a;
        Clock clockSystemUTC = Clock.systemUTC();
        AbstractC22676k.m65749i(clockSystemUTC, "systemUTC(...)");
        return new C36311d(interfaceC34108fLogEventsDao, consolePacketsApi, c36312e, interfaceC31766c, abstractC21909c, c28185n1, clockSystemUTC, (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final C17708d m103573V3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C17708d((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C34107e m103576W1(C38266c single, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(single);
        AbstractC22676k.m65748h(applicationM88531h, "null cannot be cast to non-null type com.whoop.WhoopApplication");
        return ((WhoopApplication) applicationM88531h).getLogDistributor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final InterfaceC30845b m103577W2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30846c(((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).consolePacketsDao(), (RemoteDataSource) single.m122602a(null, c22673i0.getOrCreateKotlinClass(RemoteDataSource.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (AbstractC21909c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public static final InterfaceC15606b m103578W3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C15607c((InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (InterfaceC4733b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC11114b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC11114b.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C34103a m103581X1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34103a((C34107e) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34107e.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final InterfaceC33268b m103582X2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33269c(((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).smartAlarmDiagnosticDao(), (SmartAlarmApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmApi.class), null), null, (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final InterfaceC11114b m103583X3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C15608d(((WhoopDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(WhoopDatabase.class), null)).rawDataDao(), InterfaceC34116n.INSTANCE.m107848a("RawDataRepository"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final BluetoothAdapter m103586Y1(C38266c c38266c, C34911a c34911a) {
        Object systemService = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c).getSystemService("bluetooth");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        return ((BluetoothManager) systemService).getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final C34658b m103587Y2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34658b(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public static final C9985b m103588Y3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        C11059g c11059g = (C11059g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C11059g.class), null);
        C27858u c27858u = (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext"));
        C31842a c31842a = (C31842a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C31842a.class), null);
        SmartAlarmTriggerRepository smartAlarmTriggerRepository = (SmartAlarmTriggerRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(SmartAlarmTriggerRepository.class), null);
        C40191e c40191e = (C40191e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null);
        C29020i c29020i = (C29020i) single.m122602a(new C32581a1(26), c22673i0.getOrCreateKotlinClass(C29020i.class), null);
        C38082i c38082i = (C38082i) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C38082i.class), null);
        FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null);
        NotificationRepository notificationRepository = (NotificationRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null);
        C37378a c37378a = (C37378a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37378a.class), null);
        C40197k c40197k = (C40197k) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C40197k.class), null);
        C35210f c35210f = (C35210f) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C35210f.class), null);
        FeatureFlagRepository featureFlagRepository = (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null);
        InterfaceC37217a interfaceC37217a = (InterfaceC37217a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null);
        InterfaceC39700a interfaceC39700a = (InterfaceC39700a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39700a.class), null);
        C37223g c37223g = (C37223g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37223g.class), null);
        AppConfigurationRepository appConfigurationRepository = (AppConfigurationRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppConfigurationRepository.class), null);
        InterfaceC41070a interfaceC41070a = (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null);
        C27710j0 c27710j0 = (C27710j0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27710j0.class), null);
        C27696c0 c27696c0 = (C27696c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27696c0.class), null);
        C29104a c29104a = (C29104a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29104a.class), null);
        InterfaceC21030c interfaceC21030c = (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null);
        InterfaceC12251g interfaceC12251g = (InterfaceC12251g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null);
        C17345d c17345d = (C17345d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null);
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C9985b(interfaceC31766c, c11059g, c27858u, c31842a, smartAlarmTriggerRepository, c40191e, c29020i, c38082i, featureFlagChecker, notificationRepository, c37378a, c40197k, c35210f, featureFlagRepository, interfaceC37217a, interfaceC39700a, c37223g, appConfigurationRepository, interfaceC41070a, c27710j0, c27696c0, c29104a, interfaceC21030c, interfaceC12251g, c17345d, AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, ExecutorC22364d.f87316w)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final InterfaceC26483e m103591Z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C5341k c5341k = C5341k.f21742r;
        AbstractC22676k.m65749i(c5341k, "getInstance(...)");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        return new C26484f(c5341k, AbstractC30060g.m92087G(enumC23463i, new c(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new d(factory, null, null)), (C26486h) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26486h.class), null), null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z2 */
    public static final C34660d m103592Z2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), "mainPreferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final C34911a m103593Z3() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C28162g m103597a2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        int i13 = Build.VERSION.SDK_INT;
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC22676k.m65749i(RELEASE, "RELEASE");
        String BRAND = Build.BRAND;
        AbstractC22676k.m65749i(BRAND, "BRAND");
        String MODEL = Build.MODEL;
        AbstractC22676k.m65749i(MODEL, "MODEL");
        return new C28162g("com.whoop.android", false, "release", "prodStandard", i13, RELEASE, BRAND, MODEL, false, "5.473.0", 618174, 1791587121864L, "play_prod_member", 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final C34660d m103598a3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), FeatureFlagRepositoryImplKt.FEATURE_FLAG_PREFS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final C27710j0 m103599a4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27710j0((InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final C10270c m103603b2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10270c((AbstractComponentCallbacksC1320m0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractComponentCallbacksC1320m0.class)), null, null, (AbstractC10269b) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(AbstractC10269b.class)), (C35613a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C35613a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(2, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 9), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC21718f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final C34106d m103604b3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C34106d((C34107e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34107e.class), null), (C34112j) single.m122602a(new C32223d(6), c22673i0.getOrCreateKotlinClass(C34112j.class), null), C22488a.m64989a().f88181a, (C28162g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public static final C27696c0 m103605b4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27696c0((InterfaceC17235b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17235b.class), null), (InterfaceC4733b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C34911a m103609c2(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public static final C34911a m103610c3() {
        return AbstractC15751g.m44431K(C34106d.f143006c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final C40197k m103611c4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40197k((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d2 */
    public static final C36156a m103615d2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36156a((InterfaceC27353d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public static final C34660d m103616d3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), "ble_whoop_strap_service_preferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public static final C40193g m103617d4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40193g((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C36161f m103621e2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36161f((InterfaceC21718f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), (C36156a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36156a.class), null), AbstractC17307e.f66562D2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public static final C34660d m103622e3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), LanguageRepositoryKt.LANGUAGE_PREFS_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public static final C28216y m103623e4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28216y((C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), (AbstractC32943y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null), (LanguageRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(LanguageRepository.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C36168m m103627f2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36168m((InterfaceC21718f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), (C36156a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36156a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final C34660d m103628f3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C34660d(AbstractC29125c.m88531h(single), "RealTimeRecording");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final C28159f m103629f4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28159f((C28216y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28216y.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C11818a m103633g2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C11818a((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final C25327j m103634g3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25327j((C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), (C34660d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs")), new C18265j((NotificationApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationApi.class), null)), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public static final C25561a m103635g4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C25561a(((PersistentStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19643l(), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final InterfaceC21159o0 m103639h2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        AbstractActivityC1340r0 abstractActivityC1340r0 = (AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class));
        return new C36159d(abstractActivityC1340r0, null, (C28216y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28216y.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC37217a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC37217a.class), null), (C26480b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C26480b.class), null), null, null, (C9594a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C9594a.class), null), (List) factory.m122602a(new C1871f(abstractActivityC1340r0, 12), c22673i0.getOrCreateKotlinClass(List.class), new C35953c("key-navigators")), (InterfaceC27353d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27353d.class), null), (C17345d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C17345d.class), null), (InterfaceC21153l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null), (InterfaceC21718f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21718f.class), null), (C36156a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36156a.class), null), (C36168m) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36168m.class), null), (C36161f) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36161f.class), null), (C36165j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36165j.class), null), (InterfaceC39700a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC39700a.class), null), (InterfaceC12251g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12251g.class), null), (C21138e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C21138e.class), null), (C36167l) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C36167l.class), null), 194, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final C40191e m103640h3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return ((InterfaceC40188b) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).getDispatcher();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public static final InterfaceC38652a m103641h4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C29751a((AbstractC18377p0) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final C34911a m103645i2(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final C27858u m103646i3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C27858u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public static final C36484a m103647i4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36484a(InterfaceC34116n.INSTANCE.m107848a("DataPacketUploadFileWriter"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final C36165j m103651j2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C36165j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j3 */
    public static final C28217y0 m103652j3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28217y0(AbstractC29125c.m88532i(single), (InterfaceC34116n) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public static final InterfaceC3288d m103653j4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        File filesDir = AbstractC29125c.m88532i(single).getFilesDir();
        AbstractC22676k.m65749i(filesDir, "getFilesDir(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36966a(filesDir, (C25561a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25561a.class), null), (C36967b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36967b.class), null), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (C36484a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C36484a.class), null), null, null, null, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k2 */
    public static final C36167l m103657k2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C36167l((InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public static final C28210w m103658k3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28210w(AbstractC29125c.m88532i(single), InterfaceC34116n.INSTANCE.m107848a("DeviceStateLogger"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public static final C36967b m103659k4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C36967b(((PersistentStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19635d(), ((CachedStrapPacketDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(CachedStrapPacketDatabase.class), null)).cachedMetricsDataDao(), (InterfaceC41070a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C34112j m103663l2(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(DateTimeFormatter.class));
        if (objM110111b != null) {
            return new C34112j(clockSystemDefaultZone, (DateTimeFormatter) objM110111b);
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, DateTimeFormatter.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final C0589a m103664l3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C0589a((C4329a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null), (InterfaceC34116n) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (C0570a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C0570a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public static final InterfaceC25949a m103665l4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return ((PersistentStrapPacketDatabase) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19635d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final C21606a m103669m2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21606a((InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 10), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final C28150c m103670m3(C38266c c38266c, C34911a c34911a) {
        Context contextM8292e = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28150c(contextM8292e, (C4329a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null), (C28217y0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C28217y0.class), null), (InterfaceC18260e) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18260e.class), null), (InterfaceC34116n) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (BatteryManager) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(BatteryManager.class), null), (PowerManager) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(PowerManager.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public static final C26481c m103671m4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26481c((C26482d) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26482d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final C34911a m103675n2(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final AbstractC18377p0 m103676n3(C38266c c38266c, C34911a c34911a) {
        Context context = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c);
        AbstractC22676k.m65750j(context, "context");
        return C21596v.m60637g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public static final C26482d m103677n4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C26482d((InterfaceC21030c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), null), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C39357a m103681o2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39357a((InterfaceC21159o0) factory.m122602a(new C1871f((AbstractActivityC1340r0) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(AbstractActivityC1340r0.class)), 11), c22673i0.getOrCreateKotlinClass(InterfaceC21159o0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public static final BatteryManager m103682o3(C38266c c38266c, C34911a c34911a) {
        Object systemService = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c).getSystemService("batterymanager");
        if (systemService instanceof BatteryManager) {
            return (BatteryManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public static final InterfaceC2994c0 m103683o4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return WhoopApplication.INSTANCE.m16949b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C34911a m103687p2(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final PowerManager m103688p3(C38266c c38266c, C34911a c34911a) {
        Object systemService = AbstractC2875y.m8292e(c38266c, "$this$single", c34911a, "it", c38266c).getSystemService("power");
        if (systemService instanceof PowerManager) {
            return (PowerManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public static final InterfaceC15825a m103689p4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("FirmwareEventsStore");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C38104a(interfaceC34116nM107848a, (InterfaceC14457c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14457c.class), null), (InterfaceC3288d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC3288d.class), null), (InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C12899c0 m103693q2(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        return new C12899c0((AbstractC12939a0) c34911a.m110110a(0, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC12939a0.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final AppExecutors m103694q3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new AppExecutors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public static final InterfaceC14457c m103695q4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14458d(InterfaceC34116n.INSTANCE.m107848a("FirmwareEventsRoomInteractor"), ((PersistentStrapPacketDatabase) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PersistentStrapPacketDatabase.class), null)).mo19642k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final InterfaceC24882a m103699r2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21135c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final C27861x m103700r3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27861x((C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), AbstractC29125c.m88532i(single), (UsersPreferenceApi) single.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersPreferenceApi.class), null), (C18270o) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C18270o.class), null), (C27862y) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27862y.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public static final C4362b m103701r4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4362b((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), InterfaceC34116n.INSTANCE.m107848a("DataCatchingUpHelper"), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC12361d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC12361d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final InterfaceC24883b m103705s2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21181z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public static final InterfaceC28172j0 m103706s3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28158e1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s4 */
    public static final C33267a m103707s4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("workManagerInstance");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33267a((AbstractC18377p0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), c35953c), (InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), new C35150a(AbstractC29125c.m88532i(single)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final InterfaceC39338a m103711t2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C39343f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final InterfaceC18732d m103712t3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18729a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final C33709g m103713t4(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C33709g((InterfaceC33704b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C30076h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final InterfaceC30696d m103717u2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27863z((InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), (C12086v) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12086v.class), null), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (AuthServiceApiV2) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AuthServiceApiV2.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final C6050a m103718u3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C6050a(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final C28183n m103719u4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C28183n(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v2 */
    public static final List m103723v2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C30531a c30531a = new C30531a();
        C34965c c34965c = new C34965c(null, 1, 0 == true ? 1 : 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC37056f.m118959K(c30531a, c34965c, new C35139a((FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null)), new C27350a(), new C38640a(), new C38629b(), new C38630c((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null)), new C23382c((C34660d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34660d.class), new C35953c("mainPrefs"))), new C39641h(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final C38075b m103724v3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38075b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public static final C31245d m103725v4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C31245d((C33706d) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33706d.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w2 */
    public static final InterfaceC27353d m103729w2(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "navigation mappers");
        return new C27352c((List) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class), c35953cM73387t), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public static final InterfaceC38079f m103730w3(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C38080g((C38075b) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38075b.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public static final C29020i m103731w4(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Integer.class));
        if (objM110111b != null) {
            return new C29020i(((Number) objM110111b).intValue(), (C31245d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31245d.class), null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Integer.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final InterfaceC31775l m103735x2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C31776m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final C33706d m103736x3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C33706d c33706d = new C33706d((C30076h) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30076h.class), null));
        c33706d.m106533R(AbstractC29125c.m88532i(single));
        return c33706d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public static final C29019h m103737x4(C38266c factory, C34911a c34911a) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(c34911a, "<destruct>");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29019h((Context) c34911a.m110110a(0, c22673i0.getOrCreateKotlinClass(Context.class)), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C29014c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29014c.class), null), (StartActivityRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(StartActivityRepository.class), null), (C31245d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C31245d.class), null), (RestingHeartRate) c34911a.m110110a(1, c22673i0.getOrCreateKotlinClass(RestingHeartRate.class)), (C25575d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C25575d.class), null), (C40191e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (C29020i) factory.m122602a(new C32581a1(23), c22673i0.getOrCreateKotlinClass(C29020i.class), null), new C27719q((InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C40191e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C40191e.class), null), (NotificationRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(NotificationRepository.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null)), null, null, 3072, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final C24506a m103741y2(C38266c factory, C34911a it) throws C2807c {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Application applicationM88531h = AbstractC29125c.m88531h(factory);
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C24506a(applicationM88531h, intentFilter, (BluetoothAdapter) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BluetoothAdapter.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final C30844a m103742y3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C30844a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public static final C34911a m103743y4() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final C10602a m103747z2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C10602a((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public static final InterfaceC15574a m103748z3(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35907a((InterfaceC18732d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null), (FeatureFlagRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC33704b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33704b.class), null), (C28210w) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28210w.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), ((WhoopDatabase) single.m122602a(null, c22673i0.getOrCreateKotlinClass(WhoopDatabase.class), null)).smartAlarmDiagnosticDao());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public static final InterfaceC12284b m103749z4(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C12283a((ChatClient) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ChatClient.class), null));
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m103571V1(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
