package hw0;

import c41.C4140w1;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.core.details.activitytargets.ActivityDetailsTargetsMiniArchModel;
import com.whoop.core.details.network.model.CoreDetailsModel;
import com.whoop.core.details.network.model.CoreDetailsModelState;
import com.whoop.core.details.network.model.DetailsEditComponent;
import com.whoop.core.details.network.model.GraphTitleBar;
import com.whoop.core.details.network.model.ItemModel;
import com.whoop.core.details.network.model.MenuOptionsItem;
import com.whoop.core.details.network.model.MetaData;
import com.whoop.core.details.network.model.TagModel;
import com.whoop.core.details.network.model.TitleBarModel;
import com.whoop.core.details.network.model.WeightliftingCardioDetails;
import com.whoop.core.details.network.model.WeightliftingExercisesModel;
import com.whoop.core.details.network.model.recoveryv2.GraphListItemModel;
import com.whoop.core.details.network.model.recoveryv2.RecoveryDetailsModel;
import com.whoop.core.details.network.model.recoveryv2.SegmentedControlDisplayModel;
import com.whoop.core.details.view.InterfaceC6471b;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.DesignSystemModelKt;
import com.whoop.design.models.items.AchievementProgressCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.BarGraphContainerModel;
import com.whoop.design.models.items.CtaTileModel;
import com.whoop.design.models.items.HorizontalStatModel;
import com.whoop.design.models.items.MapModel;
import com.whoop.design.models.items.StrainBreakDownModel;
import com.whoop.design.models.items.TagBackgroundStyle;
import com.whoop.design.models.items.WhoopCoachEntryPoint;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.stress.StressStateKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d11.C11474i;
import dw0.C12404c;
import dw0.InterfaceC12407f;
import dw0.InterfaceC12408g;
import dw0.InterfaceC12410i;
import ep0.C13404j;
import ew0.AbstractC13720a;
import gb1.AbstractC15673b0;
import hb1.C17091n;
import hu1.C17650g;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iw0.AbstractC20961c;
import iw0.C20963d;
import iw0.C20965e;
import iw0.C20967f;
import iw0.C20968f0;
import iw0.C20969g;
import iw0.C20971h;
import iw0.C20972h0;
import iw0.C20975j;
import iw0.C20977k;
import iw0.C20980l0;
import j71.AbstractC21394b;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k71.C22257n;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mc1.AbstractC25421f;
import mc1.EnumC25417b;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import ow0.C28431a;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p716lb1.AbstractC23608d;
import p720m91.InterfaceC25312u;
import p736sz0.C33210q;
import p745y81.EnumC39333f;
import t71.C33569f;
import tz0.C34278c;
import v41.C35674k;
import vv0.AbstractC36529b;
import w41.C36815o;
import wb3.AbstractC37056f;
import y01.C39020c;
import yv0.C39798a;

/* JADX INFO: renamed from: hw0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c*\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J9\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c*\u00020\n2\u0006\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u00112\u0006\u0010#\u001a\u00020\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u0004\u0018\u00010&*\u00020\nH\u0002¢\u0006\u0004\b'\u0010(J#\u0010-\u001a\u00020,*\b\u0012\u0004\u0012\u00020*0)2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J%\u00106\u001a\b\u0012\u0004\u0012\u00020*0\u00162\u000e\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0016H\u0002¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u00020\f*\u00020\n2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b8\u00109J/\u0010?\u001a\u0004\u0018\u00010>*\u00020\u00192\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010C\u001a\u00020\f*\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020\n2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\b\u0012\u0004\u0012\u00020*0)*\u00020\n2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bG\u0010HJ%\u0010L\u001a\u0004\u0018\u00010*2\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010K\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\bL\u0010MJ+\u0010S\u001a\u00020R*\u00020\n2\b\u0010O\u001a\u0004\u0018\u00010N2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\u0016H\u0002¢\u0006\u0004\bS\u0010TJ'\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u0016*\u00020\n2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020P0\u0016H\u0002¢\u0006\u0004\bW\u0010XJ1\u0010^\u001a\u0004\u0018\u00010]2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\u00162\u0010\b\u0002\u0010\\\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u0016H\u0002¢\u0006\u0004\b^\u0010_J'\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010\u00162\u000e\u0010Z\u001a\n\u0012\u0004\u0012\u00020[\u0018\u00010\u0016H\u0002¢\u0006\u0004\ba\u00107JK\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c*\u00020\n2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010g\u001a\u0004\u0018\u00010f*\u00020\n2\b\u0010e\u001a\u0004\u0018\u00010dH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u00020f*\u00020f2\u0006\u0010i\u001a\u00020:H\u0002¢\u0006\u0004\bj\u0010kJ7\u0010t\u001a\u00020**\u00020\n2\u0006\u0010m\u001a\u00020l2\b\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010q\u001a\u00020p2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002¢\u0006\u0004\bt\u0010uJ\u0013\u0010w\u001a\u00020v*\u00020nH\u0002¢\u0006\u0004\bw\u0010xJ5\u0010z\u001a\u00020y*\u00020\n2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020p2\b\u0010s\u001a\u0004\u0018\u00010rH\u0002¢\u0006\u0004\bz\u0010{J#\u0010|\u001a\u00020:*\u00020\n2\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\b|\u0010}J4\u0010\u0082\u0001\u001a\u00020**\u00020\n2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u00162\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0016H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J5\u0010\u0086\u0001\u001a\u00030\u0085\u0001*\u00020\n2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0\u00162\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u0016H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J*\u0010\u008a\u0001\u001a\u00030\u0089\u0001*\u00020\n2\u0006\u0010m\u001a\u00020l2\t\b\u0002\u0010\u0088\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J$\u0010\u008c\u0001\u001a\u00030\u0089\u00012\u0006\u0010m\u001a\u00020l2\u0007\u0010\u0088\u0001\u001a\u00020:H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0017\u0010\u008f\u0001\u001a\u00030\u008e\u0001*\u00020\nH\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J \u0010\u0093\u0001\u001a\u00030\u0092\u0001*\u00020\n2\u0007\u0010\u0091\u0001\u001a\u00020pH\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u0097\u0001\u001a\u00020\f2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u0001*\u00030\u0099\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u0001*\u00030\u009d\u0001H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0017\u0010¢\u0001\u001a\u00030¡\u0001*\u00020:H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020P0\u0016*\u00020/H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010ª\u0001¨\u0006«\u0001"}, m65681d2 = {"Lhw0/b;", "", "Lhw0/f;", "horizontalHeartZoneBarGraphReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ljb1/a;", "reducer", "<init>", "(Lhw0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V", "Ldw0/c;", "domainState", "Lhw0/d;", "l", "(Ldw0/c;)Lhw0/d;", "Lhw0/a;", "currentActivityType", "", "isColorByCurrentActivityType", "Ly81/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lhw0/a;Z)Ly81/f;", "", "Lcom/whoop/core/details/network/model/MenuOptionsItem;", "menuOptions", "Lcom/whoop/core/details/network/model/DetailsEditComponent;", "detailsEditComponents", "linkWorkoutOptionEnabled", "", "Lcom/whoop/design/util/TextResource;", "Lhw0/e;", "z", "(Ldw0/c;Ljava/util/List;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/Boolean;)Ljava/util/Map;", "component", "editable", "showLinkWorkoutOptionMenu", "v", "(Ldw0/c;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/Boolean;Z)Ljava/util/Map;", "Low0/a;", "g", "(Ldw0/c;)Low0/a;", "", "Lm91/u;", "item", "Ll83/a0;", "c", "(Ljava/util/List;Lm91/u;)V", "Lcom/whoop/core/details/network/model/CoreDetailsModel;", "coreDetails", "Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;", "I", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;)Lcom/whoop/core/details/activitytargets/ActivityDetailsTargetsMiniArchModel;", "Lcom/whoop/design/models/DesignSystemModel;", "designItems", "n", "(Ljava/util/List;)Ljava/util/List;", "q", "(Ldw0/c;Lcom/whoop/core/details/network/model/CoreDetailsModel;)Lhw0/d;", "", "activityId", "activityType", "resetEdit", "Lhw0/d$d;", "A", "(Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/String;Lhw0/a;Z)Lhw0/d$d;", "Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;", "recoveryDetails", "D", "(Ldw0/c;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)Lhw0/d;", "j", "(Ldw0/c;Lcom/whoop/core/details/network/model/CoreDetailsModel;)Ljava/util/List;", "k", "(Ldw0/c;Lcom/whoop/core/details/network/model/recoveryv2/RecoveryDetailsModel;)Ljava/util/List;", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "basicVowResponse", "G", "(Lcom/whoop/design/models/items/WhoopCoachVowModel;Ljava/lang/String;)Lm91/u;", "Lcom/whoop/design/models/items/StrainBreakDownModel;", "strainBreakdownModel", "Lcom/whoop/design/models/items/HorizontalStatModel;", "horizontalStat", "Liw0/g;", "x", "(Ldw0/c;Lcom/whoop/design/models/items/StrainBreakDownModel;Ljava/util/List;)Liw0/g;", "horizontalStats", "Lsz0/q;", "m", "(Ldw0/c;Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/core/details/network/model/TagModel;", "tags", "Lcom/whoop/design/models/items/TagModel;", "tagsV2", "Liw0/k;", "E", "(Ljava/util/List;Ljava/util/List;)Liw0/k;", "Lhy0/h1;", "F", "r", "(Ldw0/c;Ljava/util/List;Lcom/whoop/core/details/network/model/DetailsEditComponent;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/Map;", "Lcom/whoop/design/models/items/CtaTileModel;", "linkWorkoutCtaTile", "Ld11/i;", "y", "(Ldw0/c;Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;", "currentWorkoutId", "N", "(Ld11/i;Ljava/lang/String;)Ld11/i;", "Lcom/whoop/design/models/items/graph/GraphModel;", "graphResponse", "Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;", "exerciseItems", "Lcom/whoop/design/models/items/BarGraphContainerModel;", "heartRateZoneContainer", "Lcom/whoop/design/models/items/AdditionalInfoTextModel;", "additionalInfoTextModel", "o", "(Ldw0/c;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;)Lm91/u;", "Liw0/l0;", "H", "(Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;)Liw0/l0;", "Liw0/e;", "p", "(Ldw0/c;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;Lcom/whoop/design/models/items/BarGraphContainerModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;)Liw0/e;", "e", "(Ldw0/c;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/core/details/network/model/WeightliftingCardioDetails;)Ljava/lang/String;", "Lcom/whoop/core/details/network/model/recoveryv2/GraphListItemModel;", "graphs", "Lcom/whoop/core/details/network/model/recoveryv2/SegmentedControlDisplayModel;", "segmentedControlDisplays", "B", "(Ldw0/c;Ljava/util/List;Ljava/util/List;)Lm91/u;", "segmentedControlDisplayModel", "Liw0/f;", "C", "(Ldw0/c;Ljava/util/List;Ljava/util/List;)Liw0/f;", "graphId", "Lj71/c;", "t", "(Ldw0/c;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;)Lj71/c;", "s", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;)Lj71/c;", "Lmc1/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ldw0/c;)Lmc1/b;", "barGraphContainerModel", "Lk71/n;", "d", "(Ldw0/c;Lcom/whoop/design/models/items/BarGraphContainerModel;)Lk71/n;", "Ldw0/g$k;", "progressDomainState", "L", "(Ldw0/g$k;)Lhw0/d;", "Lcom/whoop/core/details/network/model/TitleBarModel;", "Liw0/h0;", "J", "(Lcom/whoop/core/details/network/model/TitleBarModel;)Liw0/h0;", "Ldw0/i;", "Lcom/whoop/core/details/view/b;", "M", "(Ldw0/i;)Lcom/whoop/core/details/view/b;", "Lorg/joda/time/LocalDateTime;", "K", "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;", "f", "(Lcom/whoop/core/details/network/model/CoreDetailsModel;)Ljava/util/List;", "a", "Lhw0/f;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljb1/a;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17697b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C17701f horizontalHeartZoneBarGraphReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: hw0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68658a;

        static {
            int[] iArr = new int[EnumC17696a.values().length];
            try {
                iArr[EnumC17696a.CARDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC17696a.RECOVERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC17696a.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f68658a = iArr;
        }
    }

    public C17697b(C17701f horizontalHeartZoneBarGraphReducer, FeatureFlagChecker featureFlagChecker, C21535a reducer) {
        AbstractC22676k.m65750j(horizontalHeartZoneBarGraphReducer, "horizontalHeartZoneBarGraphReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.horizontalHeartZoneBarGraphReducer = horizontalHeartZoneBarGraphReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC17699d.d m50568A(DetailsEditComponent detailsEditComponent, String str, EnumC17696a enumC17696a, boolean z4) {
        if (!AbstractC22676k.m65745e(detailsEditComponent.getActivityTypeInternalName(), "activity") || z4) {
            return null;
        }
        if (str == null || str.length() == 0) {
            throw new IllegalStateException("activity id at this point shouldn't be empty");
        }
        return new InterfaceC17699d.d(m50578K(detailsEditComponent.getStartTimeSelector().getInitialValue()), m50578K(detailsEditComponent.getEndTimeSelector().getInitialValue()), detailsEditComponent.getActivityTypeInternalName(), str, EnumC17696a.INSTANCE.m50565a(enumC17696a));
    }

    /* JADX INFO: renamed from: B */
    private final InterfaceC25312u m50569B(C12404c c12404c, List<GraphListItemModel> list, List<SegmentedControlDisplayModel> list2) {
        return list.size() == 1 ? m50601u(this, c12404c, ((GraphListItemModel) AbstractC25265s.m74096F0(list)).getGraphResponse(), null, 2, null) : m50570C(c12404c, list, list2);
    }

    /* JADX INFO: renamed from: C */
    private final C20967f m50570C(C12404c c12404c, List<GraphListItemModel> list, List<SegmentedControlDisplayModel> list2) {
        List<SegmentedControlDisplayModel> list3 = list2;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((SegmentedControlDisplayModel) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((SegmentedControlDisplayModel) it3.next()).getNameDisplay());
        }
        C20975j c20975j = new C20975j(arrayList, arrayList2);
        List<GraphListItemModel> list4 = list;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
        for (GraphListItemModel graphListItemModel : list4) {
            C21395c c21395cM50600t = m50600t(c12404c, graphListItemModel.getGraphResponse(), graphListItemModel.getGraphId());
            GraphTitleBar graphTitleBar = graphListItemModel.getGraphTitleBar();
            arrayList3.add(new C20963d(graphListItemModel.getGraphId(), c21395cM50600t, graphTitleBar != null ? new C20968f0(AbstractC8693b.m21278l(graphTitleBar.getLeadingTitle()), AbstractC8693b.m21278l(graphTitleBar.getLeadingSubtitle()), StressStateKt.toWhoopColor(graphTitleBar.getLeadingState()), AbstractC8693b.m21278l(graphTitleBar.getTrailingTitle()), AbstractC8693b.m21278l(graphTitleBar.getTrailingSubtitle()), StressStateKt.toWhoopColor(graphTitleBar.getTrailingState())) : null));
        }
        return new C20967f(c20975j, arrayList3);
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC17699d m50571D(C12404c c12404c, RecoveryDetailsModel recoveryDetailsModel) {
        return new InterfaceC17699d.b(m50577J(recoveryDetailsModel.getTitleBar()), m50598r(c12404c, null, recoveryDetailsModel.getDetailsEditComponents(), null, recoveryDetailsModel.getEditable()), m50588g(c12404c), m50592k(c12404c, recoveryDetailsModel), null, m50573F(recoveryDetailsModel.getTagsV2()), null, null, null, null, null, this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android"), this.featureFlagChecker.isFeatureEnabled("exercise-details-v2"), false, InterfaceC17699d.INSTANCE.m50615a(c12404c.getCurrentActivityType()), 10192, null);
    }

    /* JADX INFO: renamed from: E */
    private final C20977k m50572E(List<TagModel> tags, List<com.whoop.design.models.items.TagModel> tagsV2) {
        List<com.whoop.design.models.items.TagModel> list;
        if (tags.isEmpty() && ((list = tagsV2) == null || list.isEmpty())) {
            return null;
        }
        List<TagModel> list2 = tags;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8693b.m21278l(((TagModel) it.next()).getLabelDisplay()));
        }
        return new C20977k(arrayList);
    }

    /* JADX INFO: renamed from: F */
    private final List<C17750h1> m50573F(List<com.whoop.design.models.items.TagModel> tags) {
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("details-tag-style-refresh");
        ArrayList arrayList = null;
        if (tags != null) {
            List<com.whoop.design.models.items.TagModel> list = !tags.isEmpty() ? tags : null;
            if (list != null) {
                List<com.whoop.design.models.items.TagModel> list2 = list;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (com.whoop.design.models.items.TagModel tagModel : list2) {
                    InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(tagModel);
                    AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TagState");
                    C17750h1 c17750h1M50901b = (C17750h1) interfaceC25312uM60541h;
                    if (zIsFeatureEnabled && tagModel.getTagStyle() == TagBackgroundStyle.AI_COACH) {
                        float f13 = 4;
                        c17750h1M50901b = C17750h1.m50901b(c17750h1M50901b, null, null, null, null, null, null, AbstractC15673b0.m43972A(), EnumC17775o1.CONTEXT_CARD, false, AbstractC33253j.m105489e(2 * f13), 0.0f, 0.0f, 3 * f13, null, 0.0f, null, null, null, null, null, null, null, 4189503, null);
                    }
                    arrayList.add(c17750h1M50901b);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC25312u m50574G(WhoopCoachVowModel whoopCoachVow, String basicVowResponse) {
        if (whoopCoachVow != null) {
            return this.reducer.m60541h(whoopCoachVow);
        }
        if (basicVowResponse == null || basicVowResponse.length() == 0) {
            return null;
        }
        return this.reducer.m60541h(new WhoopCoachVowModel(basicVowResponse, (WhoopCoachEntryPoint) null, (C9598e) null, (String) null, (String) null, (String) null, 62, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: renamed from: H */
    private final C20980l0 m50575H(WeightliftingCardioDetails weightliftingCardioDetails) {
        WeightliftingExercisesModel weightliftingExercises = weightliftingCardioDetails.getWeightliftingExercises();
        return new C20980l0(AbstractC20961c.m58238e(weightliftingExercises), AbstractC20961c.m58239f(weightliftingExercises), AbstractC8693b.m21278l(weightliftingExercises.getTitleDisplay()), AbstractC8693b.m21278l(weightliftingExercises.getViewAllLabelDisplay()));
    }

    /* JADX INFO: renamed from: I */
    private final ActivityDetailsTargetsMiniArchModel m50576I(CoreDetailsModel coreDetails) {
        ActivityDetailsTargetsMiniArchModel activityDetailsTargetsMiniArchModel;
        List<DesignSystemModel> designItems = coreDetails.getDesignItems();
        if (designItems == null) {
            designItems = C25271y.f99162w;
        }
        Iterator<T> it = designItems.iterator();
        do {
            activityDetailsTargetsMiniArchModel = null;
            if (!it.hasNext()) {
                DesignSystemModel activityTargetsMiniArch = coreDetails.getActivityTargetsMiniArch();
                DesignSystemModel designSystemModelUnwrap = activityTargetsMiniArch != null ? DesignSystemModelKt.unwrap(activityTargetsMiniArch) : null;
                if (designSystemModelUnwrap instanceof ActivityDetailsTargetsMiniArchModel) {
                    return (ActivityDetailsTargetsMiniArchModel) designSystemModelUnwrap;
                }
                return null;
            }
            DesignSystemModel designSystemModelUnwrap2 = DesignSystemModelKt.unwrap((DesignSystemModel) it.next());
            if (designSystemModelUnwrap2 instanceof ActivityDetailsTargetsMiniArchModel) {
                activityDetailsTargetsMiniArchModel = (ActivityDetailsTargetsMiniArchModel) designSystemModelUnwrap2;
            }
        } while (activityDetailsTargetsMiniArchModel == null);
        return activityDetailsTargetsMiniArchModel;
    }

    /* JADX INFO: renamed from: J */
    private final C20972h0 m50577J(TitleBarModel titleBarModel) {
        return new C20972h0(new TextResource.C8691e(titleBarModel.getTitleDisplay()), new TextResource.C8691e(titleBarModel.getSubtitleDisplay()), AbstractC22404p.m64503l(titleBarModel.getIconUrl()));
    }

    /* JADX INFO: renamed from: K */
    private final LocalDateTime m50578K(String str) {
        return new LocalDateTime(DateTimeRange.INSTANCE.getDateTimeFormatter().withZoneUTC().parseDateTime(str).toInstant(), DateTimeZone.getDefault());
    }

    /* JADX INFO: renamed from: L */
    private final InterfaceC17699d m50579L(InterfaceC12408g.k progressDomainState) {
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC12408g.g.f42199a)) {
            return InterfaceC17699d.c.INSTANCE.m50647c();
        }
        if (progressDomainState instanceof InterfaceC12408g.j) {
            InterfaceC12408g.j jVar = (InterfaceC12408g.j) progressDomainState;
            return InterfaceC17699d.c.m50636i(InterfaceC17699d.c.INSTANCE.m50648d(), null, null, null, m50580M(jVar.getFailedAction()), null, new InterfaceC6471b.m(jVar.getErrorCloseEvent()), null, null, 215, null);
        }
        if (progressDomainState instanceof InterfaceC12408g.m) {
            InterfaceC12408g.m mVar = (InterfaceC12408g.m) progressDomainState;
            return InterfaceC17699d.c.m50636i(InterfaceC17699d.c.INSTANCE.m50649e(), null, null, null, m50580M(mVar.getFailedAction()), null, new InterfaceC6471b.m(mVar.getErrorCloseEvent()), null, null, 215, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC12408g.l.f42204a)) {
            return InterfaceC17699d.c.m50636i(InterfaceC17699d.c.INSTANCE.m50647c(), null, null, null, null, null, null, InterfaceC6471b.o.f25372a, null, 191, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC12408g.d.f42196a)) {
            return InterfaceC17699d.c.m50636i(InterfaceC17699d.c.INSTANCE.m50646b(), null, null, null, null, null, null, InterfaceC6471b.d.f25355a, null, 191, null);
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC12408g.c.f42195a)) {
            return InterfaceC17699d.c.INSTANCE.m50645a();
        }
        if (AbstractC22676k.m65745e(progressDomainState, InterfaceC12408g.n.f42207a)) {
            return InterfaceC17699d.c.INSTANCE.m50650f();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: M */
    private final InterfaceC6471b m50580M(InterfaceC12410i interfaceC12410i) {
        if (interfaceC12410i instanceof InterfaceC12410i.b) {
            return InterfaceC6471b.r.f25375a;
        }
        if (AbstractC22676k.m65745e(interfaceC12410i, InterfaceC12410i.a.f42208a)) {
            return InterfaceC6471b.q.f25374a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: N */
    private final C11474i m50581N(C11474i c11474i, String str) {
        return C11474i.m30808f(c11474i, new AbstractC13720a.g(str, "Activity Details"), null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, false, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, InterfaceC6471b.c.f25354a, null, 402653182, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m50583b(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    private final void m50584c(List<InterfaceC25312u> list, InterfaceC25312u interfaceC25312u) {
        if (interfaceC25312u != null) {
            list.add(interfaceC25312u);
        }
    }

    /* JADX INFO: renamed from: d */
    private final C22257n m50585d(C12404c c12404c, BarGraphContainerModel barGraphContainerModel) {
        if (!(c12404c.getCoreDetailsState() instanceof InterfaceC12408g.f)) {
            return this.horizontalHeartZoneBarGraphReducer.m50661c(barGraphContainerModel);
        }
        C22257n c22257nM50661c = this.horizontalHeartZoneBarGraphReducer.m50661c(barGraphContainerModel);
        return C22257n.m63917b(c22257nM50661c, null, this.horizontalHeartZoneBarGraphReducer.m50662d(c22257nM50661c.m63919c(), ((InterfaceC12408g.f) c12404c.getCoreDetailsState()).getBarType(), c12404c.getCurrentHeartZoneType(), barGraphContainerModel.getHeartRateZones()), 1, null);
    }

    /* JADX INFO: renamed from: e */
    private final String m50586e(C12404c c12404c, GraphModel graphModel, WeightliftingCardioDetails weightliftingCardioDetails) {
        String id4;
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(graphModel);
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState");
        C21395c c21395c = (C21395c) interfaceC25312uM60541h;
        if (c12404c.getCurrentExerciseCardIndex() == 0) {
            return ((AbstractC21394b) AbstractC25265s.m74096F0(c21395c.m60096f())).getId();
        }
        ItemModel itemModel = (ItemModel) AbstractC25265s.m74102I0(c12404c.getCurrentExerciseCardIndex(), weightliftingCardioDetails.getWeightliftingExercises().getExerciseSummaryCarousel().getItems());
        Object obj = null;
        String exerciseId = itemModel != null ? itemModel.getExerciseId() : null;
        List<AbstractC21394b> listM60096f = c21395c.m60096f();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM60096f) {
            if (obj2 instanceof AbstractC21394b.g) {
                arrayList.add(obj2);
            }
        }
        for (Object obj3 : arrayList) {
            if (AbstractC22676k.m65745e(((AbstractC21394b.g) obj3).getId(), exerciseId)) {
                obj = obj3;
                break;
            }
        }
        AbstractC21394b.g gVar = (AbstractC21394b.g) obj;
        return (gVar == null || (id4 = gVar.getId()) == null) ? ((AbstractC21394b) AbstractC25265s.m74096F0(c21395c.m60096f())).getId() : id4;
    }

    /* JADX INFO: renamed from: f */
    private final List<HorizontalStatModel> m50587f(CoreDetailsModel coreDetailsModel) {
        List<HorizontalStatModel> horizontalStats = coreDetailsModel.getHorizontalStats();
        if (horizontalStats.isEmpty()) {
            horizontalStats = AbstractC37056f.m118958J(coreDetailsModel.getHorizontalStat());
        }
        return horizontalStats;
    }

    /* JADX INFO: renamed from: g */
    private final C28431a m50588g(C12404c c12404c) {
        InterfaceC12407f interfaceC12407fM34864j = c12404c.getPopUpState();
        if (!AbstractC22676k.m65745e(interfaceC12407fM34864j, InterfaceC12407f.a.f42192a)) {
            if (interfaceC12407fM34864j == null) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC36529b.f156337h);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC36529b.f156335f);
        return new C28431a(c8688bM21277k, EnumC39333f.BRAND_WHITE, c8688bM21277k2, InterfaceC6471b.q.f25374a, AbstractC8693b.m21277k(AbstractC36529b.f156334e), InterfaceC6471b.l.f25369a, AbstractC8693b.m21277k(AbstractC36529b.f156336g));
    }

    /* JADX INFO: renamed from: h */
    private final EnumC39333f m50589h(EnumC17696a currentActivityType, boolean isColorByCurrentActivityType) {
        int i13 = a.f68658a[currentActivityType.ordinal()];
        if (i13 == 1) {
            return isColorByCurrentActivityType ? EnumC39333f.STRAIN : EnumC39333f.BRAND_WHITE;
        }
        if (i13 == 2) {
            return EnumC39333f.RECOVERY;
        }
        if (i13 == 3) {
            return EnumC39333f.SLEEP;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ EnumC39333f m50590i(C17697b c17697b, EnumC17696a enumC17696a, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        return c17697b.m50589h(enumC17696a, z4);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX INFO: renamed from: j */
    private final List<InterfaceC25312u> m50591j(C12404c c12404c, CoreDetailsModel coreDetailsModel) {
        C4140w1 c4140w1;
        C17697b c17697b;
        C12404c c12404c2;
        InterfaceC25312u interfaceC25312uM50595o;
        C36815o c36815oM118025b;
        C17091n c17091n;
        ArrayList arrayList = new ArrayList();
        m50584c(arrayList, m50605y(c12404c, coreDetailsModel.getLinkWorkoutCtaTile()));
        m50584c(arrayList, m50572E(coreDetailsModel.getTags(), coreDetailsModel.getTagsV2()));
        m50584c(arrayList, m50604x(c12404c, coreDetailsModel.getStrainBreakdownModel(), m50587f(coreDetailsModel)));
        DesignSystemModel momentEntryPointTile = coreDetailsModel.getMomentEntryPointTile();
        C34278c c34278c = null;
        if (momentEntryPointTile == null) {
            c4140w1 = null;
        } else {
            if (!c12404c.getShowMomentEntryPointTile()) {
                momentEntryPointTile = null;
            }
            if (momentEntryPointTile != null) {
                InterfaceC25312u interfaceC25312uM60544l = this.reducer.m60544l(momentEntryPointTile);
                if (interfaceC25312uM60544l instanceof C4140w1) {
                    c4140w1 = (C4140w1) interfaceC25312uM60544l;
                } else {
                    c4140w1 = null;
                }
            } else {
                c4140w1 = null;
            }
        }
        m50584c(arrayList, c4140w1);
        m50584c(arrayList, m50574G(coreDetailsModel.getWhoopCoachVow(), coreDetailsModel.getVowResponseString()));
        BarGraphContainerModel heartRateZoneContainer = coreDetailsModel.getHeartRateZoneContainer();
        if (heartRateZoneContainer != null) {
            c17697b = this;
            c12404c2 = c12404c;
            interfaceC25312uM50595o = c17697b.m50595o(c12404c2, coreDetailsModel.getGraphResponse(), coreDetailsModel.getWeightliftingCardioDetails(), heartRateZoneContainer, coreDetailsModel.getAdditionalInfoText());
        } else {
            c17697b = this;
            c12404c2 = c12404c;
            interfaceC25312uM50595o = null;
        }
        m50584c(arrayList, interfaceC25312uM50595o);
        BarGraphContainerModel heartRateZoneContainer2 = coreDetailsModel.getHeartRateZoneContainer();
        m50584c(arrayList, (heartRateZoneContainer2 == null || coreDetailsModel.getWeightliftingCardioDetails() != null) ? null : m50585d(c12404c2, heartRateZoneContainer2));
        AdditionalInfoTextModel additionalInfoText = coreDetailsModel.getAdditionalInfoText();
        m50584c(arrayList, (additionalInfoText == null || coreDetailsModel.getWeightliftingCardioDetails() != null) ? null : AbstractC23608d.m68616a(additionalInfoText));
        ActivityDetailsTargetsMiniArchModel activityDetailsTargetsMiniArchModelM50576I = m50576I(coreDetailsModel);
        m50584c(arrayList, activityDetailsTargetsMiniArchModelM50576I != null ? new C39798a(activityDetailsTargetsMiniArchModelM50576I.getId(), activityDetailsTargetsMiniArchModelM50576I.getPath()) : null);
        MapModel map = coreDetailsModel.getMap();
        if (map != null) {
            InterfaceC25312u interfaceC25312uM60541h = c17697b.reducer.m60541h(map);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.activitymap.ActivityMapState");
            c36815oM118025b = (C36815o) interfaceC25312uM60541h;
            if (!c17697b.featureFlagChecker.isFeatureEnabled("cardio-route-share-android")) {
                c36815oM118025b = C36815o.m118025b(c36815oM118025b, null, null, null, null, 7, null);
            }
        } else {
            c36815oM118025b = null;
        }
        m50584c(arrayList, c36815oM118025b);
        DesignSystemModel integrationPromoCard = coreDetailsModel.getIntegrationPromoCard();
        if (integrationPromoCard != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = c17697b.reducer.m60544l(integrationPromoCard);
            if (interfaceC25312uM60544l2 instanceof C17091n) {
                c17091n = (C17091n) interfaceC25312uM60544l2;
            } else {
                c17091n = null;
            }
        } else {
            c17091n = null;
        }
        m50584c(arrayList, c17091n);
        InterfaceC25312u interfaceC25312uM60541h2 = c17697b.reducer.m60541h(coreDetailsModel.getKeyMetricCarousel());
        AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.KeyMetricCarouselState");
        m50584c(arrayList, (C35674k) interfaceC25312uM60541h2);
        AchievementProgressCardModel achievementProgressCard = coreDetailsModel.getAchievementProgressCard();
        if (achievementProgressCard != null) {
            InterfaceC25312u interfaceC25312uM60544l3 = c17697b.reducer.m60544l(achievementProgressCard);
            if (interfaceC25312uM60544l3 instanceof C34278c) {
                c34278c = (C34278c) interfaceC25312uM60544l3;
            }
        }
        m50584c(arrayList, c34278c);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075  */
    /* JADX INFO: renamed from: k */
    private final List<InterfaceC25312u> m50592k(C12404c c12404c, RecoveryDetailsModel recoveryDetailsModel) {
        C17091n c17091n;
        C34278c c34278c;
        ArrayList arrayList = new ArrayList();
        m50584c(arrayList, m50572E(recoveryDetailsModel.getTags(), recoveryDetailsModel.getTagsV2()));
        C36815o c36815o = null;
        m50584c(arrayList, m50604x(c12404c, null, recoveryDetailsModel.getHorizontalStat()));
        m50584c(arrayList, m50574G(recoveryDetailsModel.getWhoopCoachVow(), ""));
        m50584c(arrayList, m50569B(c12404c, recoveryDetailsModel.getGraphResponse(), recoveryDetailsModel.getSegmentedControlDisplay()));
        BarGraphContainerModel heartRateZoneContainer = recoveryDetailsModel.getHeartRateZoneContainer();
        m50584c(arrayList, heartRateZoneContainer != null ? m50585d(c12404c, heartRateZoneContainer) : null);
        DesignSystemModel integrationPromoCard = recoveryDetailsModel.getIntegrationPromoCard();
        if (integrationPromoCard != null) {
            InterfaceC25312u interfaceC25312uM60544l = this.reducer.m60544l(integrationPromoCard);
            if (interfaceC25312uM60544l instanceof C17091n) {
                c17091n = (C17091n) interfaceC25312uM60544l;
            } else {
                c17091n = null;
            }
        } else {
            c17091n = null;
        }
        m50584c(arrayList, c17091n);
        AchievementProgressCardModel achievementProgressCard = recoveryDetailsModel.getAchievementProgressCard();
        if (achievementProgressCard != null) {
            InterfaceC25312u interfaceC25312uM60544l2 = this.reducer.m60544l(achievementProgressCard);
            if (interfaceC25312uM60544l2 instanceof C34278c) {
                c34278c = (C34278c) interfaceC25312uM60544l2;
            } else {
                c34278c = null;
            }
        } else {
            c34278c = null;
        }
        m50584c(arrayList, c34278c);
        InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(recoveryDetailsModel.getKeyMetricCarousel());
        AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.KeyMetricCarouselState");
        m50584c(arrayList, (C35674k) interfaceC25312uM60541h);
        List<DesignSystemModel> tiles = recoveryDetailsModel.getTiles();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h2 = this.reducer.m60541h((DesignSystemModel) it.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.impacttile.ImpactActivityCardState");
            arrayList2.add((C33569f) interfaceC25312uM60541h2);
        }
        m50584c(arrayList, new C20971h(arrayList2));
        MapModel map = recoveryDetailsModel.getMap();
        if (map != null) {
            InterfaceC25312u interfaceC25312uM60541h3 = this.reducer.m60541h(map);
            AbstractC22676k.m65748h(interfaceC25312uM60541h3, "null cannot be cast to non-null type com.whoop.design.atomic.organism.activitymap.ActivityMapState");
            c36815o = (C36815o) interfaceC25312uM60541h3;
        }
        m50584c(arrayList, c36815o);
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    private final List<C33210q> m50593m(C12404c c12404c, List<HorizontalStatModel> list) {
        if (c12404c.getCurrentHeartRateState() != null) {
            return AbstractC37056f.m118958J(new C33210q(null, c12404c.getCurrentHeartRateState().getValueDisplay(), null, c12404c.getCurrentHeartRateState().getUnitDisplay(), null, null, c12404c.getCurrentHeartRateState().getTimeDisplay(), false, m50590i(this, c12404c.getCurrentActivityType(), false, 2, null), null, null, false, 3765, null));
        }
        List<HorizontalStatModel> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h((HorizontalStatModel) obj);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState");
            arrayList.add(C33210q.m105317b((C33210q) interfaceC25312uM60541h, null, null, null, null, null, null, null, false, m50589h(c12404c.getCurrentActivityType(), i13 == 0), null, null, false, 3839, null));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    private final List<InterfaceC25312u> m50594n(List<? extends DesignSystemModel> designItems) {
        if (designItems == null) {
            designItems = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (DesignSystemModel designSystemModel : designItems) {
            InterfaceC25312u interfaceC25312uM60544l = DesignSystemModelKt.unwrap(designSystemModel) instanceof ActivityDetailsTargetsMiniArchModel ? null : this.reducer.m60544l(designSystemModel);
            if (interfaceC25312uM60544l != null) {
                arrayList.add(interfaceC25312uM60544l);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC25312u m50595o(C12404c c12404c, GraphModel graphModel, WeightliftingCardioDetails weightliftingCardioDetails, BarGraphContainerModel barGraphContainerModel, AdditionalInfoTextModel additionalInfoTextModel) {
        return weightliftingCardioDetails == null ? m50601u(this, c12404c, graphModel, null, 2, null) : m50596p(c12404c, graphModel, weightliftingCardioDetails, barGraphContainerModel, additionalInfoTextModel);
    }

    /* JADX INFO: renamed from: p */
    private final C20965e m50596p(C12404c c12404c, GraphModel graphModel, WeightliftingCardioDetails weightliftingCardioDetails, BarGraphContainerModel barGraphContainerModel, AdditionalInfoTextModel additionalInfoTextModel) {
        List<SegmentedControlDisplayModel> segmentedControlDisplay = weightliftingCardioDetails.getSegmentedControlDisplay();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segmentedControlDisplay, 10));
        Iterator<T> it = segmentedControlDisplay.iterator();
        while (it.hasNext()) {
            arrayList.add(((SegmentedControlDisplayModel) it.next()).getId());
        }
        List<SegmentedControlDisplayModel> segmentedControlDisplay2 = weightliftingCardioDetails.getSegmentedControlDisplay();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(segmentedControlDisplay2, 10));
        Iterator<T> it3 = segmentedControlDisplay2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((SegmentedControlDisplayModel) it3.next()).getNameDisplay());
        }
        return new C20965e(new C20975j(arrayList, arrayList2), m50599s(graphModel, m50586e(c12404c, graphModel, weightliftingCardioDetails)), m50601u(this, c12404c, graphModel, null, 2, null), m50575H(weightliftingCardioDetails), m50585d(c12404c, barGraphContainerModel), c12404c.getCurrentExerciseCardIndex(), additionalInfoTextModel != null ? AbstractC23608d.m68616a(additionalInfoTextModel) : null);
    }

    /* JADX INFO: renamed from: q */
    private final InterfaceC17699d m50597q(C12404c c12404c, CoreDetailsModel coreDetailsModel) {
        C20980l0 c20980l0M50575H;
        AiContextMetadata aiContextMetadata;
        C20972h0 c20972h0M50577J = m50577J(coreDetailsModel.getTitleBar());
        C28431a c28431aM50588g = m50588g(c12404c);
        Map<TextResource, C17700e> mapM50598r = m50598r(c12404c, coreDetailsModel.getMenuOptions(), coreDetailsModel.getDetailsEditComponents(), coreDetailsModel.getLinkWorkoutOptionEnabled(), coreDetailsModel.getEditable());
        List<InterfaceC25312u> listM50591j = m50591j(c12404c, coreDetailsModel);
        List<InterfaceC25312u> listM50594n = m50594n(coreDetailsModel.getDesignItems());
        List<C17750h1> listM50573F = m50573F(coreDetailsModel.getTagsV2());
        List<String> onboardingOverlays = coreDetailsModel.getOnboardingOverlays();
        C13404j c13404jM18523a = null;
        String str = onboardingOverlays != null ? (String) AbstractC25265s.m74100H0(onboardingOverlays) : null;
        InterfaceC12408g interfaceC12408gM34857c = c12404c.getCoreDetailsState();
        if (!(interfaceC12408gM34857c instanceof InterfaceC12408g.e) || !((InterfaceC12408g.e) interfaceC12408gM34857c).getShow() || coreDetailsModel.getWeightliftingCardioDetails() == null) {
            interfaceC12408gM34857c = null;
        }
        if (interfaceC12408gM34857c != null) {
            WeightliftingCardioDetails weightliftingCardioDetails = coreDetailsModel.getWeightliftingCardioDetails();
            c20980l0M50575H = weightliftingCardioDetails != null ? m50575H(weightliftingCardioDetails) : null;
        } else {
            c20980l0M50575H = null;
        }
        InterfaceC17699d.d dVarM50568A = m50568A(coreDetailsModel.getDetailsEditComponents(), c12404c.getCurrentWorkoutId(), c12404c.getCurrentActivityType(), c12404c.getIsResetEditScreenAutoPopState());
        String activityTypeInternalName = coreDetailsModel.getDetailsEditComponents().getActivityTypeInternalName();
        MetaData metadata = coreDetailsModel.getMetadata();
        if (metadata != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new InterfaceC17699d.b(c20972h0M50577J, mapM50598r, c28431aM50588g, listM50591j, listM50594n, listM50573F, str, c20980l0M50575H, dVarM50568A, activityTypeInternalName, c13404jM18523a, this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android"), this.featureFlagChecker.isFeatureEnabled("exercise-details-v2"), this.featureFlagChecker.isFeatureEnabled("estimated-one-rep-max"), InterfaceC17699d.INSTANCE.m50615a(c12404c.getCurrentActivityType()));
    }

    /* JADX INFO: renamed from: r */
    private final Map<TextResource, C17700e> m50598r(C12404c c12404c, List<MenuOptionsItem> list, DetailsEditComponent detailsEditComponent, Boolean bool, Boolean bool2) {
        List<MenuOptionsItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return m50602v(c12404c, detailsEditComponent, bool2, bool != null ? bool.booleanValue() : false);
        }
        return m50606z(c12404c, list, detailsEditComponent, bool);
    }

    /* JADX INFO: renamed from: s */
    private final C21395c m50599s(GraphModel graphResponse, String graphId) {
        return AbstractC25421f.m74622b(graphResponse, graphId);
    }

    /* JADX INFO: renamed from: t */
    private final C21395c m50600t(C12404c c12404c, GraphModel graphModel, String str) {
        return AbstractC25421f.m74622b(graphModel, AbstractC25421f.m74623c(m50603w(c12404c), EnumC17696a.INSTANCE.m50567c(c12404c.getCurrentActivityType()), str));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ C21395c m50601u(C17697b c17697b, C12404c c12404c, GraphModel graphModel, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "HEART_RATE";
        }
        return c17697b.m50600t(c12404c, graphModel, str);
    }

    /* JADX INFO: renamed from: v */
    private final Map<TextResource, C17700e> m50602v(C12404c c12404c, DetailsEditComponent detailsEditComponent, Boolean bool, boolean z4) {
        if (bool != null && !bool.booleanValue()) {
            return AbstractC25247g0.m73989X(new C23465k(AbstractC8693b.m21277k(AbstractC36529b.f156339j), new C17700e(InterfaceC6471b.e.f25356a, null, 2, null)));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM34862h = c12404c.getCurrentWorkoutId();
        if (strM34862h == null || strM34862h.length() == 0) {
            throw new IllegalStateException("activity id at this point shouldn't be empty");
        }
        linkedHashMap.put(AbstractC8693b.m21277k(AbstractC36529b.f156340k), new C17700e(new AbstractC13720a.d(m50578K(detailsEditComponent.getStartTimeSelector().getInitialValue()), m50578K(detailsEditComponent.getEndTimeSelector().getInitialValue()), detailsEditComponent.getActivityTypeInternalName(), c12404c.getCurrentWorkoutId(), EnumC17696a.INSTANCE.m50565a(c12404c.getCurrentActivityType())), null, 2, null));
        linkedHashMap.put(AbstractC8693b.m21277k(AbstractC36529b.f156339j), new C17700e(InterfaceC6471b.e.f25356a, null, 2, null));
        if (z4) {
            linkedHashMap.put(AbstractC8693b.m21277k(AbstractC36529b.f156341l), new C17700e(new AbstractC13720a.g(c12404c.getCurrentWorkoutId(), "Activity Details - Menu"), null, 2, null));
        }
        return AbstractC25247g0.m74001j0(linkedHashMap);
    }

    /* JADX INFO: renamed from: w */
    private final EnumC25417b m50603w(C12404c c12404c) {
        return ((c12404c.getCoreDetailsState() instanceof InterfaceC12408g.a) || (c12404c.getCoreDetailsState() instanceof InterfaceC12408g.f)) ? c12404c.getCurrentHeartZoneType() : EnumC25417b.NONE;
    }

    /* JADX INFO: renamed from: x */
    private final C20969g m50604x(C12404c c12404c, StrainBreakDownModel strainBreakDownModel, List<HorizontalStatModel> list) {
        C39020c c39020c;
        List<C33210q> listM50593m = m50593m(c12404c, list);
        if (strainBreakDownModel != null) {
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(strainBreakDownModel);
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.comparisonbar.ComparisonBarState");
            c39020c = (C39020c) interfaceC25312uM60541h;
        } else {
            c39020c = null;
        }
        return new C20969g(listM50593m, c39020c);
    }

    /* JADX INFO: renamed from: y */
    private final C11474i m50605y(C12404c c12404c, CtaTileModel ctaTileModel) {
        if (c12404c.getCurrentWorkoutId() != null && c12404c.getShowLinkWorkoutCtaTile() && ctaTileModel != null) {
            InterfaceC25312u interfaceC25312uM60541h = this.reducer.m60541h(ctaTileModel);
            C11474i c11474i = interfaceC25312uM60541h instanceof C11474i ? (C11474i) interfaceC25312uM60541h : null;
            if (c11474i != null) {
                return m50581N(c11474i, c12404c.getCurrentWorkoutId());
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x002d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    private final Map<TextResource, C17700e> m50606z(C12404c c12404c, List<MenuOptionsItem> list, DetailsEditComponent detailsEditComponent, Boolean bool) {
        C9598e destination;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<MenuOptionsItem> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (MenuOptionsItem menuOptionsItem : list2) {
            String action = menuOptionsItem.getAction();
            switch (action.hashCode()) {
                case -1565832482:
                    if (action.equals("LINK_MSK_WORKOUT") && c12404c.getCurrentWorkoutId() != null) {
                        if (AbstractC22676k.m65745e(bool, Boolean.TRUE)) {
                            linkedHashMap.put(AbstractC8693b.m21278l(menuOptionsItem.getDisplayLabel()), new C17700e(new AbstractC13720a.g(c12404c.getCurrentWorkoutId(), "Activity Details - Menu"), menuOptionsItem.getIcon()));
                        }
                    }
                    arrayList.add(C23454a0.f92919a);
                    break;
                case -1221339409:
                    if (action.equals("MAKE_A_MOMENT")) {
                        destination = menuOptionsItem.getDestination();
                        if (destination != null) {
                            linkedHashMap.put(AbstractC8693b.m21278l(menuOptionsItem.getDisplayLabel()), new C17700e(new AbstractC13720a.b(destination), menuOptionsItem.getIcon()));
                        }
                    }
                    arrayList.add(C23454a0.f92919a);
                    break;
                case 2123274:
                    if (action.equals("EDIT")) {
                        String strM34862h = c12404c.getCurrentWorkoutId();
                        if (strM34862h == null || strM34862h.length() == 0) {
                            throw new IllegalStateException("activity id at this point shouldn't be empty");
                        }
                        linkedHashMap.put(AbstractC8693b.m21278l(menuOptionsItem.getDisplayLabel()), new C17700e(new AbstractC13720a.d(m50578K(detailsEditComponent.getStartTimeSelector().getInitialValue()), m50578K(detailsEditComponent.getEndTimeSelector().getInitialValue()), detailsEditComponent.getActivityTypeInternalName(), c12404c.getCurrentWorkoutId(), EnumC17696a.INSTANCE.m50565a(c12404c.getCurrentActivityType())), menuOptionsItem.getIcon()));
                    }
                    arrayList.add(C23454a0.f92919a);
                    break;
                case 78862271:
                    if (action.equals("SHARE")) {
                        destination = menuOptionsItem.getDestination();
                        if (destination != null) {
                            linkedHashMap.put(AbstractC8693b.m21278l(menuOptionsItem.getDisplayLabel()), new C17700e(new AbstractC13720a.b(destination), menuOptionsItem.getIcon()));
                        }
                    }
                    arrayList.add(C23454a0.f92919a);
                    break;
                case 2012838315:
                    if (action.equals("DELETE")) {
                        linkedHashMap.put(AbstractC8693b.m21278l(menuOptionsItem.getDisplayLabel()), new C17700e(InterfaceC6471b.e.f25356a, menuOptionsItem.getIcon()));
                    }
                    arrayList.add(C23454a0.f92919a);
                    break;
                default:
                    arrayList.add(C23454a0.f92919a);
                    break;
            }
        }
        return AbstractC25247g0.m74001j0(linkedHashMap);
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC17699d m50607l(C12404c domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        if (domainState.getCoreDetailsState() instanceof InterfaceC12408g.k) {
            return m50579L((InterfaceC12408g.k) domainState.getCoreDetailsState());
        }
        CoreDetailsModelState coreDetailsModelStateM34863i = domainState.getDetailsModelState();
        if (coreDetailsModelStateM34863i instanceof CoreDetailsModelState.CoreDetails) {
            return m50597q(domainState, ((CoreDetailsModelState.CoreDetails) coreDetailsModelStateM34863i).getCoreDetails());
        }
        if (coreDetailsModelStateM34863i instanceof CoreDetailsModelState.RecoveryDetails) {
            return m50571D(domainState, ((CoreDetailsModelState.RecoveryDetails) coreDetailsModelStateM34863i).getRecoveryDetails());
        }
        if (coreDetailsModelStateM34863i == null) {
            return InterfaceC17699d.c.INSTANCE.m50649e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C17697b(C17701f c17701f, FeatureFlagChecker featureFlagChecker, C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c17701f, featureFlagChecker, (i13 & 4) != 0 ? AbstractC21537c.m60554d(new C17650g(1)) : c21535a);
    }
}
