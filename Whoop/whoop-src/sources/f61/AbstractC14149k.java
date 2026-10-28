package f61;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import com.whoop.design.util.AbstractC8693b;
import g61.C15529b;
import g61.EnumC15531d;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21372f;
import j61.C21374h;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.List;
import k61.C22230c;
import l83.C23454a0;
import m83.C25271y;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import u61.C34552a;
import u61.C34556e;
import wb3.AbstractC37056f;
import yy0.C39889c;

/* JADX INFO: renamed from: f61.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000b\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Lj61/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "Lg61/b;", "j", "()Lg61/b;", "g", "Lj71/c;", "e", "()Lj71/c;", "d", "Lj71/b$g;", "i", "()Lj71/b$g;", "Lu61/e;", "a", "Ljava/util/List;", "f", "fakeSleepHrPoint", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14149k {

    /* JADX INFO: renamed from: a */
    private static final List<C34556e> f50958a = AbstractC37056f.m118959K(new C34556e(0.0f, 0.39486277f, null, null, null, null, 60, null), new C34556e(0.0025f, 0.33668247f, null, null, null, null, 60, null), new C34556e(0.005f, 0.431723f, null, null, null, null, 60, null), new C34556e(0.0075f, 0.390927f, null, null, null, null, 60, null), new C34556e(0.01f, 0.39514214f, null, null, null, null, 60, null), new C34556e(0.0125f, 0.49258605f, null, null, null, null, 60, null), new C34556e(0.015f, 0.3624349f, null, null, null, null, 60, null), new C34556e(0.0175f, 0.4608765f, null, null, null, null, 60, null), new C34556e(0.02f, 0.4709331f, null, null, null, null, 60, null), new C34556e(0.0225f, 0.47643965f, null, null, null, null, 60, null), new C34556e(0.025f, 0.36984548f, null, null, null, null, 60, null), new C34556e(0.0275f, 0.28301468f, null, null, null, null, 60, null), new C34556e(0.03f, 0.39432493f, null, null, null, null, 60, null), new C34556e(0.0325f, 0.3023071f, null, null, null, null, 60, null), new C34556e(0.035f, 0.34583363f, null, null, null, null, 60, null), new C34556e(0.0375f, 0.45741946f, null, null, null, null, 60, null), new C34556e(0.04f, 0.39692515f, null, null, null, null, 60, null), new C34556e(0.0425f, 0.3933438f, null, null, null, null, 60, null), new C34556e(0.045f, 0.40810546f, null, null, null, null, 60, null), new C34556e(0.0475f, 0.38584223f, null, null, null, null, 60, null), new C34556e(0.05f, 0.38076326f, null, null, null, null, 60, null), new C34556e(0.0525f, 0.46458232f, null, null, null, null, 60, null), new C34556e(0.055f, 0.34457836f, null, null, null, null, 60, null), new C34556e(0.0575f, 0.36943382f, null, null, null, null, 60, null), new C34556e(0.06f, 0.3615142f, null, null, null, null, 60, null), new C34556e(0.0625f, 0.40128377f, null, null, null, null, 60, null), new C34556e(0.065f, 0.3917354f, null, null, null, null, 60, null), new C34556e(0.0675f, 0.33951196f, null, null, null, null, 60, null), new C34556e(0.07f, 0.38910797f, null, null, null, null, 60, null), new C34556e(0.0725f, 0.54074484f, null, null, null, null, 60, null), new C34556e(0.075f, 0.41155624f, null, null, null, null, 60, null), new C34556e(0.0775f, 0.37780946f, null, null, null, null, 60, null), new C34556e(0.08f, 0.4370064f, null, null, null, null, 60, null), new C34556e(0.0825f, 0.36576045f, null, null, null, null, 60, null), new C34556e(0.085f, 0.4732714f, null, null, null, null, 60, null), new C34556e(0.0875f, 0.4107956f, null, null, null, null, 60, null), new C34556e(0.09f, 0.3240302f, null, null, null, null, 60, null), new C34556e(0.0925f, 0.27443266f, null, null, null, null, 60, null), new C34556e(0.095f, 0.42379948f, null, null, null, null, 60, null), new C34556e(0.0975f, 0.39068145f, null, null, null, null, 60, null), new C34556e(0.1f, 0.39005578f, null, null, null, null, 60, null), new C34556e(0.1025f, 0.43846995f, null, null, null, null, 60, null), new C34556e(0.105f, 0.36171618f, null, null, null, null, 60, null), new C34556e(0.1075f, 0.39340964f, null, null, null, null, 60, null), new C34556e(0.11f, 0.3846093f, null, null, null, null, 60, null), new C34556e(0.1125f, 0.41034168f, null, null, null, null, 60, null), new C34556e(0.115f, 0.33420393f, null, null, null, null, 60, null), new C34556e(0.1175f, 0.4497228f, null, null, null, null, 60, null), new C34556e(0.12f, 0.43950632f, null, null, null, null, 60, null), new C34556e(0.1225f, 0.36126354f, null, null, null, null, 60, null), new C34556e(0.125f, 0.34695587f, null, null, null, null, 60, null), new C34556e(0.1275f, 0.38221562f, null, null, null, null, 60, null), new C34556e(0.13f, 0.42268366f, null, null, null, null, 60, null), new C34556e(0.1325f, 0.44593364f, null, null, null, null, 60, null), new C34556e(0.135f, 0.34726933f, null, null, null, null, 60, null), new C34556e(0.1375f, 0.45659164f, null, null, null, null, 60, null), new C34556e(0.14f, 0.38591775f, null, null, null, null, 60, null), new C34556e(0.1425f, 0.34484112f, null, null, null, null, 60, null), new C34556e(0.145f, 0.37189478f, null, null, null, null, 60, null), new C34556e(0.1475f, 0.357088f, null, null, null, null, 60, null), new C34556e(0.15f, 0.36352202f, null, null, null, null, 60, null), new C34556e(0.1525f, 0.33310702f, null, null, null, null, 60, null), new C34556e(0.155f, 0.38261405f, null, null, null, null, 60, null), new C34556e(0.1575f, 0.39069647f, null, null, null, null, 60, null), new C34556e(0.16f, 0.3689838f, null, null, null, null, 60, null), new C34556e(0.1625f, 0.46998006f, null, null, null, null, 60, null), new C34556e(0.165f, 0.5233609f, null, null, null, null, 60, null), new C34556e(0.1675f, 0.40253243f, null, null, null, null, 60, null), new C34556e(0.17f, 0.43314898f, null, null, null, null, 60, null), new C34556e(0.1725f, 0.3704854f, null, null, null, null, 60, null), new C34556e(0.175f, 0.37919033f, null, null, null, null, 60, null), new C34556e(0.1775f, 0.47069347f, null, null, null, null, 60, null), new C34556e(0.18f, 0.42335704f, null, null, null, null, 60, null), new C34556e(0.1825f, 0.36134282f, null, null, null, null, 60, null), new C34556e(0.185f, 0.39057395f, null, null, null, null, 60, null), new C34556e(0.1875f, 0.45682395f, null, null, null, null, 60, null), new C34556e(0.19f, 0.31564578f, null, null, null, null, 60, null), new C34556e(0.1925f, 0.31559917f, null, null, null, null, 60, null), new C34556e(0.195f, 0.4097749f, null, null, null, null, 60, null), new C34556e(0.1975f, 0.41605785f, null, null, null, null, 60, null), new C34556e(0.2f, 0.44282547f, null, null, null, null, 60, null), new C34556e(0.2025f, 0.51882195f, null, null, null, null, 60, null), new C34556e(0.205f, 0.34171042f, null, null, null, null, 60, null), new C34556e(0.2075f, 0.4124242f, null, null, null, null, 60, null), new C34556e(0.21f, 0.33543748f, null, null, null, null, 60, null), new C34556e(0.2125f, 0.5224647f, null, null, null, null, 60, null), new C34556e(0.215f, 0.38828516f, null, null, null, null, 60, null), new C34556e(0.2175f, 0.41052574f, null, null, null, null, 60, null), new C34556e(0.22f, 0.5429674f, null, null, null, null, 60, null), new C34556e(0.2225f, 0.36997074f, null, null, null, null, 60, null), new C34556e(0.225f, 0.44248095f, null, null, null, null, 60, null), new C34556e(0.2275f, 0.39596274f, null, null, null, null, 60, null), new C34556e(0.23f, 0.40710223f, null, null, null, null, 60, null), new C34556e(0.2325f, 0.39708933f, null, null, null, null, 60, null), new C34556e(0.235f, 0.38929784f, null, null, null, null, 60, null), new C34556e(0.2375f, 0.5087254f, null, null, null, null, 60, null), new C34556e(0.24f, 0.44578183f, null, null, null, null, 60, null), new C34556e(0.2425f, 0.34048656f, null, null, null, null, 60, null), new C34556e(0.245f, 0.39035755f, null, null, null, null, 60, null), new C34556e(0.2475f, 0.5505302f, null, null, null, null, 60, null), new C34556e(0.25f, 0.38489172f, null, null, null, null, 60, null), new C34556e(0.2525f, 0.43165913f, null, null, null, null, 60, null), new C34556e(0.255f, 0.36177766f, null, null, null, null, 60, null), new C34556e(0.2575f, 0.4242894f, null, null, null, null, 60, null), new C34556e(0.26f, 0.3719955f, null, null, null, null, 60, null), new C34556e(0.2625f, 0.41891596f, null, null, null, null, 60, null), new C34556e(0.265f, 0.48001143f, null, null, null, null, 60, null), new C34556e(0.2675f, 0.41947064f, null, null, null, null, 60, null), new C34556e(0.27f, 0.53952545f, null, null, null, null, 60, null), new C34556e(0.2725f, 0.4353436f, null, null, null, null, 60, null), new C34556e(0.275f, 0.45202935f, null, null, null, null, 60, null), new C34556e(0.2775f, 0.4953739f, null, null, null, null, 60, null), new C34556e(0.28f, 0.3875399f, null, null, null, null, 60, null), new C34556e(0.2825f, 0.47311312f, null, null, null, null, 60, null), new C34556e(0.285f, 0.38758725f, null, null, null, null, 60, null), new C34556e(0.2875f, 0.34392765f, null, null, null, null, 60, null), new C34556e(0.29f, 0.49523726f, null, null, null, null, 60, null), new C34556e(0.2925f, 0.424236f, null, null, null, null, 60, null), new C34556e(0.295f, 0.4122142f, null, null, null, null, 60, null), new C34556e(0.2975f, 0.52293134f, null, null, null, null, 60, null), new C34556e(0.3f, 0.41747618f, null, null, null, null, 60, null), new C34556e(0.3025f, 0.5555658f, null, null, null, null, 60, null), new C34556e(0.305f, 0.35558048f, null, null, null, null, 60, null), new C34556e(0.3075f, 0.3268179f, null, null, null, null, 60, null), new C34556e(0.31f, 0.35703707f, null, null, null, null, 60, null), new C34556e(0.3125f, 0.39193052f, null, null, null, null, 60, null), new C34556e(0.315f, 0.34672984f, null, null, null, null, 60, null), new C34556e(0.3175f, 0.37924618f, null, null, null, null, 60, null), new C34556e(0.32f, 0.37727502f, null, null, null, null, 60, null), new C34556e(0.3225f, 0.41208956f, null, null, null, null, 60, null), new C34556e(0.325f, 0.45159286f, null, null, null, null, 60, null), new C34556e(0.3275f, 0.3658686f, null, null, null, null, 60, null), new C34556e(0.33f, 0.3334294f, null, null, null, null, 60, null), new C34556e(0.3325f, 0.4030886f, null, null, null, null, 60, null), new C34556e(0.335f, 0.32725668f, null, null, null, null, 60, null), new C34556e(0.3375f, 0.5175316f, null, null, null, null, 60, null), new C34556e(0.34f, 0.56633204f, null, null, null, null, 60, null), new C34556e(0.3425f, 0.40490904f, null, null, null, null, 60, null), new C34556e(0.345f, 0.29939643f, null, null, null, null, 60, null), new C34556e(0.3475f, 0.41350043f, null, null, null, null, 60, null), new C34556e(0.35f, 0.32438412f, null, null, null, null, 60, null), new C34556e(0.3525f, 0.33510563f, null, null, null, null, 60, null), new C34556e(0.355f, 0.27991188f, null, null, null, null, 60, null), new C34556e(0.3575f, 0.43477538f, null, null, null, null, 60, null), new C34556e(0.36f, 0.47948068f, null, null, null, null, 60, null), new C34556e(0.3625f, 0.37522274f, null, null, null, null, 60, null), new C34556e(0.365f, 0.3813785f, null, null, null, null, 60, null), new C34556e(0.3675f, 0.38078994f, null, null, null, null, 60, null), new C34556e(0.37f, 0.40196767f, null, null, null, null, 60, null), new C34556e(0.3725f, 0.42560703f, null, null, null, null, 60, null), new C34556e(0.375f, 0.3965846f, null, null, null, null, 60, null), new C34556e(0.3775f, 0.4409846f, null, null, null, null, 60, null), new C34556e(0.38f, 0.38557026f, null, null, null, null, 60, null), new C34556e(0.3825f, 0.38934633f, null, null, null, null, 60, null), new C34556e(0.385f, 0.49245724f, null, null, null, null, 60, null), new C34556e(0.3875f, 0.30472505f, null, null, null, null, 60, null), new C34556e(0.39f, 0.34758168f, null, null, null, null, 60, null), new C34556e(0.3925f, 0.35866007f, null, null, null, null, 60, null), new C34556e(0.395f, 0.2851307f, null, null, null, null, 60, null), new C34556e(0.3975f, 0.36981043f, null, null, null, null, 60, null), new C34556e(0.4f, 0.34638438f, null, null, null, null, 60, null), new C34556e(0.4025f, 0.44294792f, null, null, null, null, 60, null), new C34556e(0.405f, 0.4381431f, null, null, null, null, 60, null), new C34556e(0.4075f, 0.40241072f, null, null, null, null, 60, null), new C34556e(0.41f, 0.49500695f, null, null, null, null, 60, null), new C34556e(0.4125f, 0.43159702f, null, null, null, null, 60, null), new C34556e(0.415f, 0.29426077f, null, null, null, null, 60, null), new C34556e(0.4175f, 0.40832764f, null, null, null, null, 60, null), new C34556e(0.42f, 0.35355768f, null, null, null, null, 60, null), new C34556e(0.4225f, 0.31170928f, null, null, null, null, 60, null), new C34556e(0.425f, 0.47252932f, null, null, null, null, 60, null), new C34556e(0.4275f, 0.37115487f, null, null, null, null, 60, null), new C34556e(0.43f, 0.3373841f, null, null, null, null, 60, null), new C34556e(0.4325f, 0.32060117f, null, null, null, null, 60, null), new C34556e(0.435f, 0.4751334f, null, null, null, null, 60, null), new C34556e(0.4375f, 0.4667016f, null, null, null, null, 60, null), new C34556e(0.44f, 0.4758455f, null, null, null, null, 60, null), new C34556e(0.4425f, 0.324012f, null, null, null, null, 60, null), new C34556e(0.445f, 0.39550847f, null, null, null, null, 60, null), new C34556e(0.4475f, 0.4546784f, null, null, null, null, 60, null), new C34556e(0.45f, 0.3824155f, null, null, null, null, 60, null), new C34556e(0.4525f, 0.29659852f, null, null, null, null, 60, null), new C34556e(0.455f, 0.2967763f, null, null, null, null, 60, null), new C34556e(0.4575f, 0.37092f, null, null, null, null, 60, null), new C34556e(0.46f, 0.36007378f, null, null, null, null, 60, null), new C34556e(0.4625f, 0.29715952f, null, null, null, null, 60, null), new C34556e(0.465f, 0.31380096f, null, null, null, null, 60, null), new C34556e(0.4675f, 0.46182746f, null, null, null, null, 60, null), new C34556e(0.47f, 0.4804448f, null, null, null, null, 60, null), new C34556e(0.4725f, 0.3864952f, null, null, null, null, 60, null), new C34556e(0.475f, 0.47259438f, null, null, null, null, 60, null), new C34556e(0.4775f, 0.44293076f, null, null, null, null, 60, null), new C34556e(0.48f, 0.37795433f, null, null, null, null, 60, null), new C34556e(0.4825f, 0.35563672f, null, null, null, null, 60, null), new C34556e(0.485f, 0.44424868f, null, null, null, null, 60, null), new C34556e(0.4875f, 0.3798651f, null, null, null, null, 60, null), new C34556e(0.49f, 0.28879842f, null, null, null, null, 60, null), new C34556e(0.4925f, 0.36042425f, null, null, null, null, 60, null), new C34556e(0.495f, 0.530412f, null, null, null, null, 60, null), new C34556e(0.4975f, 0.3701113f, null, null, null, null, 60, null), new C34556e(0.5f, 0.41357148f, null, null, null, null, 60, null), new C34556e(0.5025f, 0.4251812f, null, null, null, null, 60, null), new C34556e(0.505f, 0.47544363f, null, null, null, null, 60, null), new C34556e(0.5075f, 0.40503323f, null, null, null, null, 60, null), new C34556e(0.51f, 0.42701048f, null, null, null, null, 60, null), new C34556e(0.5125f, 0.3339942f, null, null, null, null, 60, null), new C34556e(0.515f, 0.5033163f, null, null, null, null, 60, null), new C34556e(0.5175f, 0.43160275f, null, null, null, null, 60, null), new C34556e(0.52f, 0.52333134f, null, null, null, null, 60, null), new C34556e(0.5225f, 0.40359068f, null, null, null, null, 60, null), new C34556e(0.525f, 0.4683281f, null, null, null, null, 60, null), new C34556e(0.5275f, 0.38182372f, null, null, null, null, 60, null), new C34556e(0.53f, 0.32877126f, null, null, null, null, 60, null), new C34556e(0.5325f, 0.34738737f, null, null, null, null, 60, null), new C34556e(0.535f, 0.3920464f, null, null, null, null, 60, null), new C34556e(0.5375f, 0.32195762f, null, null, null, null, 60, null), new C34556e(0.54f, 0.4321681f, null, null, null, null, 60, null), new C34556e(0.5425f, 0.4974884f, null, null, null, null, 60, null), new C34556e(0.545f, 0.39571136f, null, null, null, null, 60, null), new C34556e(0.5475f, 0.4639718f, null, null, null, null, 60, null), new C34556e(0.55f, 0.369629f, null, null, null, null, 60, null), new C34556e(0.5525f, 0.48086372f, null, null, null, null, 60, null), new C34556e(0.555f, 0.5374004f, null, null, null, null, 60, null), new C34556e(0.5575f, 0.4089035f, null, null, null, null, 60, null), new C34556e(0.56f, 0.48435232f, null, null, null, null, 60, null), new C34556e(0.5625f, 0.3779332f, null, null, null, null, 60, null), new C34556e(0.565f, 0.2961379f, null, null, null, null, 60, null), new C34556e(0.5675f, 0.46157458f, null, null, null, null, 60, null), new C34556e(0.57f, 0.35929534f, null, null, null, null, 60, null), new C34556e(0.5725f, 0.444395f, null, null, null, null, 60, null), new C34556e(0.575f, 0.41647232f, null, null, null, null, 60, null), new C34556e(0.5775f, 0.39683098f, null, null, null, null, 60, null), new C34556e(0.58f, 0.38845065f, null, null, null, null, 60, null), new C34556e(0.5825f, 0.394046f, null, null, null, null, 60, null), new C34556e(0.585f, 0.46493524f, null, null, null, null, 60, null), new C34556e(0.5875f, 0.24948171f, null, null, null, null, 60, null), new C34556e(0.59f, 0.43937388f, null, null, null, null, 60, null), new C34556e(0.5925f, 0.331396f, null, null, null, null, 60, null), new C34556e(0.595f, 0.41640595f, null, null, null, null, 60, null), new C34556e(0.5975f, 0.35000116f, null, null, null, null, 60, null), new C34556e(0.6f, 0.3121177f, null, null, null, null, 60, null), new C34556e(0.6025f, 0.4868265f, null, null, null, null, 60, null), new C34556e(0.605f, 0.49645045f, null, null, null, null, 60, null), new C34556e(0.6075f, 0.43995628f, null, null, null, null, 60, null), new C34556e(0.61f, 0.44057396f, null, null, null, null, 60, null), new C34556e(0.6125f, 0.39307502f, null, null, null, null, 60, null), new C34556e(0.615f, 0.5114585f, null, null, null, null, 60, null), new C34556e(0.6175f, 0.48934302f, null, null, null, null, 60, null), new C34556e(0.62f, 0.40043166f, null, null, null, null, 60, null), new C34556e(0.6225f, 0.35390988f, null, null, null, null, 60, null), new C34556e(0.625f, 0.30773586f, null, null, null, null, 60, null), new C34556e(0.6275f, 0.5212582f, null, null, null, null, 60, null), new C34556e(0.63f, 0.49758816f, null, null, null, null, 60, null), new C34556e(0.6325f, 0.38327742f, null, null, null, null, 60, null), new C34556e(0.635f, 0.52020186f, null, null, null, null, 60, null), new C34556e(0.6375f, 0.4048334f, null, null, null, null, 60, null), new C34556e(0.64f, 0.4016951f, null, null, null, null, 60, null), new C34556e(0.6425f, 0.33092356f, null, null, null, null, 60, null), new C34556e(0.645f, 0.46586174f, null, null, null, null, 60, null), new C34556e(0.6475f, 0.38695922f, null, null, null, null, 60, null), new C34556e(0.65f, 0.45814115f, null, null, null, null, 60, null), new C34556e(0.6525f, 0.45619673f, null, null, null, null, 60, null), new C34556e(0.655f, 0.58580595f, null, null, null, null, 60, null), new C34556e(0.6575f, 0.39142573f, null, null, null, null, 60, null), new C34556e(0.66f, 0.40322316f, null, null, null, null, 60, null), new C34556e(0.6625f, 0.34186098f, null, null, null, null, 60, null), new C34556e(0.665f, 0.4292628f, null, null, null, null, 60, null), new C34556e(0.6675f, 0.28555593f, null, null, null, null, 60, null), new C34556e(0.67f, 0.31172884f, null, null, null, null, 60, null), new C34556e(0.6725f, 0.36191738f, null, null, null, null, 60, null), new C34556e(0.675f, 0.45830598f, null, null, null, null, 60, null), new C34556e(0.6775f, 0.41535833f, null, null, null, null, 60, null), new C34556e(0.68f, 0.33924118f, null, null, null, null, 60, null), new C34556e(0.6825f, 0.33408946f, null, null, null, null, 60, null), new C34556e(0.685f, 0.31495035f, null, null, null, null, 60, null), new C34556e(0.6875f, 0.43721333f, null, null, null, null, 60, null), new C34556e(0.69f, 0.34127715f, null, null, null, null, 60, null), new C34556e(0.6925f, 0.44189078f, null, null, null, null, 60, null), new C34556e(0.695f, 0.32768282f, null, null, null, null, 60, null), new C34556e(0.6975f, 0.49531665f, null, null, null, null, 60, null), new C34556e(0.7f, 0.4279459f, null, null, null, null, 60, null), new C34556e(0.7025f, 0.42492512f, null, null, null, null, 60, null), new C34556e(0.705f, 0.35269287f, null, null, null, null, 60, null), new C34556e(0.7075f, 0.375556f, null, null, null, null, 60, null), new C34556e(0.71f, 0.4286291f, null, null, null, null, 60, null), new C34556e(0.7125f, 0.40419132f, null, null, null, null, 60, null), new C34556e(0.715f, 0.44579747f, null, null, null, null, 60, null), new C34556e(0.7175f, 0.48765343f, null, null, null, null, 60, null), new C34556e(0.72f, 0.3182487f, null, null, null, null, 60, null), new C34556e(0.7225f, 0.40709308f, null, null, null, null, 60, null), new C34556e(0.725f, 0.36314183f, null, null, null, null, 60, null), new C34556e(0.7275f, 0.34649888f, null, null, null, null, 60, null), new C34556e(0.73f, 0.35660124f, null, null, null, null, 60, null), new C34556e(0.7325f, 0.44863355f, null, null, null, null, 60, null), new C34556e(0.735f, 0.4562524f, null, null, null, null, 60, null), new C34556e(0.7375f, 0.51095283f, null, null, null, null, 60, null), new C34556e(0.74f, 0.5085084f, null, null, null, null, 60, null), new C34556e(0.7425f, 0.34493953f, null, null, null, null, 60, null), new C34556e(0.745f, 0.34039524f, null, null, null, null, 60, null), new C34556e(0.7475f, 0.47240868f, null, null, null, null, 60, null), new C34556e(0.75f, 0.49449798f, null, null, null, null, 60, null), new C34556e(0.7525f, 0.5377014f, null, null, null, null, 60, null), new C34556e(0.755f, 0.43038702f, null, null, null, null, 60, null), new C34556e(0.7575f, 0.3567106f, null, null, null, null, 60, null), new C34556e(0.76f, 0.45518902f, null, null, null, null, 60, null), new C34556e(0.7625f, 0.26968423f, null, null, null, null, 60, null), new C34556e(0.765f, 0.37664312f, null, null, null, null, 60, null), new C34556e(0.7675f, 0.3097772f, null, null, null, null, 60, null), new C34556e(0.77f, 0.34717408f, null, null, null, null, 60, null), new C34556e(0.7725f, 0.4432269f, null, null, null, null, 60, null), new C34556e(0.775f, 0.46149504f, null, null, null, null, 60, null), new C34556e(0.7775f, 0.42394608f, null, null, null, null, 60, null), new C34556e(0.78f, 0.42226204f, null, null, null, null, 60, null), new C34556e(0.7825f, 0.34692895f, null, null, null, null, 60, null), new C34556e(0.785f, 0.41852432f, null, null, null, null, 60, null), new C34556e(0.7875f, 0.49036673f, null, null, null, null, 60, null), new C34556e(0.79f, 0.5230326f, null, null, null, null, 60, null), new C34556e(0.7925f, 0.2533848f, null, null, null, null, 60, null), new C34556e(0.795f, 0.38413033f, null, null, null, null, 60, null), new C34556e(0.7975f, 0.37178946f, null, null, null, null, 60, null), new C34556e(0.8f, 0.397593f, null, null, null, null, 60, null), new C34556e(0.8025f, 0.37917185f, null, null, null, null, 60, null), new C34556e(0.805f, 0.42340598f, null, null, null, null, 60, null), new C34556e(0.8075f, 0.31954443f, null, null, null, null, 60, null), new C34556e(0.81f, 0.27425906f, null, null, null, null, 60, null), new C34556e(0.8125f, 0.4069363f, null, null, null, null, 60, null), new C34556e(0.815f, 0.4131375f, null, null, null, null, 60, null), new C34556e(0.8175f, 0.4164347f, null, null, null, null, 60, null), new C34556e(0.82f, 0.44345424f, null, null, null, null, 60, null), new C34556e(0.8225f, 0.38034183f, null, null, null, null, 60, null), new C34556e(0.825f, 0.42945927f, null, null, null, null, 60, null), new C34556e(0.8275f, 0.45685875f, null, null, null, null, 60, null), new C34556e(0.83f, 0.39681646f, null, null, null, null, 60, null), new C34556e(0.8325f, 0.4338674f, null, null, null, null, 60, null), new C34556e(0.835f, 0.40549305f, null, null, null, null, 60, null), new C34556e(0.8375f, 0.24356633f, null, null, null, null, 60, null), new C34556e(0.84f, 0.35863653f, null, null, null, null, 60, null), new C34556e(0.8425f, 0.4264737f, null, null, null, null, 60, null), new C34556e(0.845f, 0.42016026f, null, null, null, null, 60, null), new C34556e(0.8475f, 0.38384116f, null, null, null, null, 60, null), new C34556e(0.85f, 0.37134025f, null, null, null, null, 60, null), new C34556e(0.8525f, 0.30501756f, null, null, null, null, 60, null), new C34556e(0.855f, 0.4903939f, null, null, null, null, 60, null), new C34556e(0.8575f, 0.36085996f, null, null, null, null, 60, null), new C34556e(0.86f, 0.4417576f, null, null, null, null, 60, null), new C34556e(0.8625f, 0.4553151f, null, null, null, null, 60, null), new C34556e(0.865f, 0.47669706f, null, null, null, null, 60, null), new C34556e(0.8675f, 0.4415578f, null, null, null, null, 60, null), new C34556e(0.87f, 0.45850703f, null, null, null, null, 60, null), new C34556e(0.8725f, 0.3654318f, null, null, null, null, 60, null), new C34556e(0.875f, 0.46010268f, null, null, null, null, 60, null), new C34556e(0.8775f, 0.4244475f, null, null, null, null, 60, null), new C34556e(0.88f, 0.3636279f, null, null, null, null, 60, null), new C34556e(0.8825f, 0.4471854f, null, null, null, null, 60, null), new C34556e(0.885f, 0.3678005f, null, null, null, null, 60, null), new C34556e(0.8875f, 0.5090969f, null, null, null, null, 60, null), new C34556e(0.89f, 0.4875446f, null, null, null, null, 60, null), new C34556e(0.8925f, 0.43619186f, null, null, null, null, 60, null), new C34556e(0.895f, 0.4771898f, null, null, null, null, 60, null), new C34556e(0.8975f, 0.35696638f, null, null, null, null, 60, null), new C34556e(0.9f, 0.40832853f, null, null, null, null, 60, null), new C34556e(0.9025f, 0.40207204f, null, null, null, null, 60, null), new C34556e(0.905f, 0.27753446f, null, null, null, null, 60, null), new C34556e(0.9075f, 0.43773967f, null, null, null, null, 60, null), new C34556e(0.91f, 0.5054918f, null, null, null, null, 60, null), new C34556e(0.9125f, 0.38251248f, null, null, null, null, 60, null), new C34556e(0.915f, 0.444312f, null, null, null, null, 60, null), new C34556e(0.9175f, 0.38271394f, null, null, null, null, 60, null), new C34556e(0.92f, 0.50058806f, null, null, null, null, 60, null), new C34556e(0.9225f, 0.48475134f, null, null, null, null, 60, null), new C34556e(0.925f, 0.35792562f, null, null, null, null, 60, null), new C34556e(0.9275f, 0.3503715f, null, null, null, null, 60, null), new C34556e(0.93f, 0.37212625f, null, null, null, null, 60, null), new C34556e(0.9325f, 0.33262476f, null, null, null, null, 60, null), new C34556e(0.935f, 0.41766655f, null, null, null, null, 60, null), new C34556e(0.9375f, 0.39155442f, null, null, null, null, 60, null), new C34556e(0.94f, 0.40412423f, null, null, null, null, 60, null), new C34556e(0.9425f, 0.4060603f, null, null, null, null, 60, null), new C34556e(0.945f, 0.43504202f, null, null, null, null, 60, null), new C34556e(0.9475f, 0.39305183f, null, null, null, null, 60, null), new C34556e(0.95f, 0.32546377f, null, null, null, null, 60, null), new C34556e(0.9525f, 0.37488982f, null, null, null, null, 60, null), new C34556e(0.955f, 0.32556963f, null, null, null, null, 60, null), new C34556e(0.9575f, 0.49483538f, null, null, null, null, 60, null), new C34556e(0.96f, 0.439845f, null, null, null, null, 60, null), new C34556e(0.9625f, 0.39401546f, null, null, null, null, 60, null), new C34556e(0.965f, 0.34685352f, null, null, null, null, 60, null), new C34556e(0.9675f, 0.47102588f, null, null, null, null, 60, null), new C34556e(0.97f, 0.34979114f, null, null, null, null, 60, null), new C34556e(0.9725f, 0.41060585f, null, null, null, null, 60, null), new C34556e(0.975f, 0.37323108f, null, null, null, null, 60, null), new C34556e(0.9775f, 0.44424465f, null, null, null, null, 60, null), new C34556e(0.98f, 0.43452606f, null, null, null, null, 60, null), new C34556e(0.9825f, 0.5171241f, null, null, null, null, 60, null), new C34556e(0.985f, 0.37016118f, null, null, null, null, 60, null), new C34556e(0.9875f, 0.2956362f, null, null, null, null, 60, null), new C34556e(0.99f, 0.29851407f, null, null, null, null, 60, null), new C34556e(0.9925f, 0.37223446f, null, null, null, null, 60, null), new C34556e(0.995f, 0.37064347f, null, null, null, null, 60, null), new C34556e(0.9975f, 0.27764642f, null, null, null, null, 60, null), new C34556e(1.0f, 0.4298331f, null, null, null, null, 60, null));

    /* JADX INFO: renamed from: f61.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f50959w = new a();

        /* JADX INFO: renamed from: a */
        public final long m40332a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40332a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.k$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f50960w = new b();

        /* JADX INFO: renamed from: a */
        public final long m40333a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40333a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.k$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f50961w = new c();

        /* JADX INFO: renamed from: a */
        public final long m40334a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40334a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.k$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f50962w = new d();

        /* JADX INFO: renamed from: a */
        public final long m40335a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40335a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f61.k$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f50963w = new e();

        /* JADX INFO: renamed from: a */
        public final long m40336a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m40336a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m40323b(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1421401093);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC2756k.m7799p(AbstractC1099a.m3394p(1, AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier), false, 1.3333334f)), m40326e(), null, null, false, null, null, c28655q, 0, 124);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 10, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m40324c(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m40323b(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final C15529b m40325d() {
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(a.f50959w);
        return C15529b.m43718b(new C15529b(0.0f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("40"), null, interfaceC39332eM125323a, 0.1f, 0.2f, null, 34, null), new C39889c(AbstractC8693b.m21278l("60"), null, interfaceC39332eM125323a, 0.1f, 0.4f, null, 34, null), new C39889c(AbstractC8693b.m21278l("80"), null, interfaceC39332eM125323a, 0.1f, 0.6f, null, 34, null), new C39889c(AbstractC8693b.m21278l("100"), null, interfaceC39332eM125323a, 0.1f, 0.8f, null, 34, null)), 0.0f, EnumC15531d.TIME_MARKER, AbstractC8693b.m21278l("3:05pm"), false, null, null, 193, null), 0.0f, C25271y.f99162w, 0.0f, null, null, false, null, null, 253, null);
    }

    /* JADX INFO: renamed from: e */
    private static final C21395c m40326e() {
        return new C21395c(new C21374h(m40331j(), m40325d(), m40328g(), null, new C16618c(0.0f, 0.025f, 0.0f, 0.04f), m40329h(), null, null, false, false, null, 0L, 0.0f, 8136, null), AbstractC37056f.m118958J(m40330i()), null, null, 12, null);
    }

    /* JADX INFO: renamed from: f */
    public static final List<C34556e> m40327f() {
        return f50958a;
    }

    /* JADX INFO: renamed from: g */
    private static final C15529b m40328g() {
        return new C15529b(0.15f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("10:41 PM"), null, p745y81.Function1.m125323a(b.f50960w), 0.25f, 0.0f, null, 50, null), new C39889c(AbstractC8693b.m21278l("7:01 AM"), null, p745y81.Function1.m125323a(c.f50961w), 0.6666667f, 0.0f, null, 50, null)), 0.0f, null, null, false, null, null, 252, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private static final List<C21372f> m40329h() {
        C21372f c21372f = new C21372f(1.0f, null, null, null, null, null, null, 126, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        C21372f c21372f2 = new C21372f(0.75f, objArr, objArr2, objArr3, objArr4, objArr5, null, 126, null);
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        InterfaceC39332e interfaceC39332e = null;
        return AbstractC37056f.m118959K(c21372f, c21372f2, new C21372f(0.5f, objArr6, objArr7, objArr8, objArr9, objArr10, null, 126, null), new C21372f(0.25f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, interfaceC39332e, 126, null));
    }

    /* JADX INFO: renamed from: i */
    private static final AbstractC21394b.g m40330i() {
        return new AbstractC21394b.g(AbstractC37056f.m118958J(new C34552a(f50958a, null, new C22230c(0.0f, 0, 0, AbstractC18249c.m52575m(p745y81.Function1.m125323a(d.f50962w)), 0L, false, 55, null), null, 10, null)), "id", false, null, null, false, 60, null);
    }

    /* JADX INFO: renamed from: j */
    private static final C15529b m40331j() {
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(e.f50963w);
        return new C15529b(0.0f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("40"), null, interfaceC39332eM125323a, 0.9f, 0.2f, null, 34, null), new C39889c(AbstractC8693b.m21278l("60"), null, interfaceC39332eM125323a, 0.9f, 0.4f, null, 34, null), new C39889c(AbstractC8693b.m21278l("80"), null, interfaceC39332eM125323a, 0.9f, 0.6f, null, 34, null), new C39889c(AbstractC8693b.m21278l("100"), null, interfaceC39332eM125323a, 0.9f, 0.8f, null, 34, null)), 0.08f, EnumC15531d.TIME_MARKER, AbstractC8693b.m21278l("3:01 AM"), true, null, null, 193, null);
    }
}
