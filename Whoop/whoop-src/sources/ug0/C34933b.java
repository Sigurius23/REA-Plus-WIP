package ug0;

import android.net.Uri;
import androidx.recyclerview.widget.AbstractC1707m0;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c91.AbstractC4328b;
import c93.InterfaceC4351m;
import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.bot.models.conversation.MxmCreateCaseTileModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignModelWrapper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SuggestionBubbleModel;
import com.whoop.p057ai.chat.models.AIConversation;
import com.whoop.p057ai.chat.models.AIConversationMetadata;
import com.whoop.p057ai.chat.models.AIMessage;
import com.whoop.p057ai.chat.models.AITurn;
import com.whoop.p057ai.chat.models.Attachment;
import com.whoop.p057ai.chat.models.AttachmentType;
import com.whoop.p057ai.chat.models.TurnFeedbackResponse;
import com.whoop.service.network.model.UserState;
import dc3.InterfaceC11927l;
import dc3.InterfaceC11939x;
import ec3.AbstractC13091v;
import ec3.C13031e0;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fl0.C14567l;
import fl0.EnumC14565j;
import hl0.AbstractC17395d;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg0.AbstractC31380a;
import rg0.C31381b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tg0.AbstractC33776a;
import tg0.C33777b;
import tg0.C33783h;
import tg0.InterfaceC33779d;
import vg0.AbstractC35996k;
import vg0.AbstractC36002n;
import vg0.AbstractC36008q;
import vg0.AbstractC36011r0;
import vg0.AbstractC36014t;
import vg0.AbstractC36017u0;
import vg0.AbstractC36020w;
import vg0.AbstractC36023x0;
import vg0.AbstractC36026z;
import vg0.C35975a0;
import vg0.C35976a1;
import vg0.C35977b;
import vg0.C35979b1;
import vg0.C35983d0;
import vg0.C35985e0;
import vg0.C35990h;
import vg0.C35992i;
import vg0.C35993i0;
import vg0.C35994j;
import vg0.C35997k0;
import vg0.C35998l;
import vg0.C35999l0;
import vg0.C36000m;
import vg0.C36006p;
import vg0.C36007p0;
import vg0.C36009q0;
import vg0.C36010r;
import vg0.C36012s;
import vg0.C36013s0;
import vg0.C36015t0;
import vg0.C36018v;
import vg0.C36019v0;
import vg0.C36021w0;
import vg0.C36022x;
import vg0.C36024y;
import vg0.C36025y0;
import vg0.C36027z0;
import wb3.AbstractC37056f;
import wg0.C37256f;
import wg0.C37257g;
import wg0.C37258h;
import xg0.AbstractC38269a;
import xg0.AbstractC38270b;
import xg0.C38271c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ug0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 Ë\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u009f\u0001B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J#\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b0\u00101J3\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030.2\u0006\u00102\u001a\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u00104\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u00106J2\u0010<\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00032\u0006\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020:2\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u001f\u0010C\u001a\u00020@2\u0006\u0010>\u001a\u00020:2\u0006\u00109\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010DJ'\u0010H\u001a\u00020@2\u0006\u0010>\u001a\u00020:2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020@2\u0006\u0010>\u001a\u00020:2\u0006\u00108\u001a\u00020JH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\"\u0010O\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u0003H\u0082@¢\u0006\u0004\bO\u0010PJ*\u0010S\u001a\u00020@*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u0010R\u001a\u00020QH\u0082@¢\u0006\u0004\bS\u0010TJ*\u0010V\u001a\u00020@*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u0010R\u001a\u00020UH\u0082@¢\u0006\u0004\bV\u0010WJ\"\u0010Y\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00108\u001a\u00020XH\u0082@¢\u0006\u0004\bY\u0010ZJ\u001a\u0010[\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u000307H\u0082@¢\u0006\u0004\b[\u0010\\J*\u0010^\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020]H\u0082@¢\u0006\u0004\b^\u0010_J*\u0010a\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020`H\u0082@¢\u0006\u0004\ba\u0010bJ6\u0010e\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u0010c\u001a\u00020\u00032\u0006\u0010F\u001a\u00020E2\n\b\u0002\u0010d\u001a\u0004\u0018\u00010EH\u0082@¢\u0006\u0004\be\u0010fJ \u0010g\u001a\u00020\u00032\u0006\u0010c\u001a\u00020\u00032\u0006\u0010F\u001a\u00020EH\u0082@¢\u0006\u0004\bg\u0010hJ\u001f\u0010j\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020iH\u0002¢\u0006\u0004\bj\u0010kJ:\u0010q\u001a\u0004\u0018\u00010o2\u0006\u0010l\u001a\u00020\u00032\u0006\u0010>\u001a\u00020:2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00020m2\b\u0010p\u001a\u0004\u0018\u00010oH\u0082@¢\u0006\u0004\bq\u0010rJ\u0013\u0010s\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\bs\u0010tJ\u0013\u0010v\u001a\u00020u*\u00020\u0002H\u0002¢\u0006\u0004\bv\u0010wJ*\u0010x\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bx\u0010yJ*\u0010z\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0002H\u0082@¢\u0006\u0004\bz\u0010yJ\"\u0010{\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b{\u0010PJ(\u0010~\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010}\u001a\u00020|2\u0006\u0010F\u001a\u00020EH\u0082@¢\u0006\u0004\b~\u0010\u007fJ4\u0010\u0081\u0001\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u00032\u0006\u0010}\u001a\u00020|2\u0006\u0010F\u001a\u00020E2\u0007\u0010\u0080\u0001\u001a\u00020EH\u0082@¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J.\u0010\u0084\u0001\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0007\u00108\u001a\u00030\u0083\u0001H\u0082@¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J.\u0010\u0087\u0001\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0007\u00108\u001a\u00030\u0086\u0001H\u0082@¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J.\u0010\u008a\u0001\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u0003072\u0006\u00109\u001a\u00020\u00032\u0007\u00108\u001a\u00030\u0089\u0001H\u0082@¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\"\u0010\u008c\u0001\u001a\u00020u2\u0006\u0010}\u001a\u00020|2\u0006\u0010G\u001a\u00020EH\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J4\u0010\u008f\u0001\u001a\u00020\u00032\u0007\u0010l\u001a\u00030\u008e\u00012\u0006\u00109\u001a\u00020\u00032\u0006\u0010}\u001a\u00020|2\u0007\u00108\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J+\u0010\u0092\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|2\u0006\u0010G\u001a\u00020E2\u0007\u0010\u0091\u0001\u001a\u00020EH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J.\u0010\u0096\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|2\u0006\u0010G\u001a\u00020E2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0094\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001a\u0010\u0098\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J$\u0010\u009c\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J$\u0010\u009e\u0001\u001a\u00020|2\u0006\u0010}\u001a\u00020|2\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001¨\u0006Ì\u0001"}, m65681d2 = {"Lug0/b;", "Lod1/g;", "Ltg0/a;", "Ltg0/b;", "Lvg0/m;", "createConversationInteractor", "Lvg0/q0;", "startNewConversationInteractor", "Lvg0/y;", "getConversationTurnInteractor", "Lvg0/v;", "getConversationMetadataInteractor", "Lvg0/s;", "createTurnInteractor", "Lvg0/h;", "aiChatImageInteractor", "Lvg0/b;", "aiChatFileInteractor", "Lvg0/w0;", "stopTurnInteractor", "Lvg0/t0;", "stopAllTurnsInteractor", "Lvg0/z0;", "submitTurnFeedbackInteractor", "Lvg0/p;", "createMxmSupportTicketInteractor", "Lvg0/b1;", "turnPollingInteractor", "Lwg0/f;", "turnInterpolationInteractor", "Lvg0/a0;", "getSuggestionsInteractor", "Lvg0/j;", "commitRecommendationInteractor", "Lrg0/b;", "analyticsHelper", "Lvg0/i0;", "markTurnAsSeenOrchestrator", "Lvg0/l0;", "markTurnEndViewedInteractor", "Lvg0/e0;", "markLastViewedTurnInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lvg0/m;Lvg0/q0;Lvg0/y;Lvg0/v;Lvg0/s;Lvg0/h;Lvg0/b;Lvg0/w0;Lvg0/t0;Lvg0/z0;Lvg0/p;Lvg0/b1;Lwg0/f;Lvg0/a0;Lvg0/j;Lrg0/b;Lvg0/i0;Lvg0/l0;Lvg0/e0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "conversationAction", "otherActions", "currentState", "K", "(Ltg0/a;Lec3/l;Ltg0/b;)Lec3/l;", "Lec3/m;", "action", "accumulator", "Lbc3/c0;", "receiptScope", "k0", "(Lec3/m;Ltg0/a;Ltg0/b;Lbc3/c0;Lq83/d;)Ljava/lang/Object;", "scope", "Ltg0/a$r;", "Ll83/a0;", "e0", "(Lbc3/c0;Ltg0/b;Ltg0/a$r;)V", "o0", "(Lbc3/c0;Ltg0/b;)V", "", "fingerprint", "turnId", "q0", "(Lbc3/c0;Ljava/lang/String;Ljava/lang/String;)V", "Ltg0/a$g;", "X", "(Lbc3/c0;Ltg0/a$g;)V", "p0", "(Ltg0/b;Ltg0/a$g;)Ltg0/b;", "Y", "(Lec3/m;Ltg0/b;Lq83/d;)Ljava/lang/Object;", "Ltg0/e;", "error", "N", "(Lec3/m;Ltg0/b;Ltg0/e;Lq83/d;)Ljava/lang/Object;", "Lc91/b;", "O", "(Lec3/m;Ltg0/b;Lc91/b;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$b;", "R", "(Lec3/m;Ltg0/a$b;Lq83/d;)Ljava/lang/Object;", "Z", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$f;", "V", "(Lec3/m;Ltg0/b;Ltg0/a$f;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$d;", "T", "(Lec3/m;Ltg0/b;Ltg0/a$d;Lq83/d;)Ljava/lang/Object;", "currentResult", "turnIdToPoll", "i0", "(Lec3/m;Ltg0/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "P", "(Ltg0/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$q;", "J", "(Ltg0/b;Ltg0/a$q;)Ltg0/b;", "result", "Ldc3/x;", "actions", "Lbc3/k1;", "previousSuggestionsJob", "f0", "(Ltg0/b;Lbc3/c0;Ldc3/x;Lbc3/k1;Lq83/d;)Ljava/lang/Object;", "s0", "(Ltg0/b;)Ltg0/b;", "", "M", "(Ltg0/a;)Z", "W", "(Lec3/m;Ltg0/b;Ltg0/a;Lq83/d;)Ljava/lang/Object;", "U", "c0", "Lcom/whoop/ai/chat/models/AIConversation;", "conversation", "a0", "(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "activeTurnId", "b0", "(Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$p;", "d0", "(Lec3/m;Ltg0/b;Ltg0/a$p;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$c;", "S", "(Lec3/m;Ltg0/b;Ltg0/a$c;Lq83/d;)Ljava/lang/Object;", "Ltg0/a$a;", "Q", "(Lec3/m;Ltg0/b;Ltg0/a$a;Lq83/d;)Ljava/lang/Object;", "L", "(Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;)Z", "Lvg0/q;", "g0", "(Lvg0/q;Ltg0/b;Lcom/whoop/ai/chat/models/AIConversation;Ltg0/a$c;)Ltg0/b;", "actionId", "h0", "(Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/ai/chat/models/AIConversation;", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "feedback", "r0", "(Lcom/whoop/ai/chat/models/AIConversation;Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;)Lcom/whoop/ai/chat/models/AIConversation;", "l0", "(Lcom/whoop/ai/chat/models/AIConversation;)Lcom/whoop/ai/chat/models/AIConversation;", "Lcom/whoop/ai/chat/models/AITurn;", "turn", "I", "(Lcom/whoop/ai/chat/models/AIConversation;Lcom/whoop/ai/chat/models/AITurn;)Lcom/whoop/ai/chat/models/AIConversation;", "n0", "a", "Lvg0/m;", "b", "Lvg0/q0;", "c", "Lvg0/y;", "d", "Lvg0/v;", "e", "Lvg0/s;", "f", "Lvg0/h;", "g", "Lvg0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lvg0/w0;", "i", "Lvg0/t0;", "j", "Lvg0/z0;", "k", "Lvg0/p;", "l", "Lvg0/b1;", "m", "Lwg0/f;", "n", "Lvg0/a0;", "o", "Lvg0/j;", "p", "Lrg0/b;", "q", "Lvg0/i0;", "r", "Lvg0/l0;", "s", "Lvg0/e0;", "t", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lug0/e;", "u", "Lug0/e;", "turnEndSeenTracker", "v", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34933b implements InterfaceC27844g<AbstractC33776a, C33777b> {

    /* JADX INFO: renamed from: v */
    private static final a f147053v = new a(null);

    /* JADX INFO: renamed from: w */
    public static final int f147054w = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C36000m createConversationInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C36009q0 startNewConversationInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36024y getConversationTurnInteractor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C36018v getConversationMetadataInteractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C36012s createTurnInteractor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C35990h aiChatImageInteractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C35977b aiChatFileInteractor;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C36021w0 stopTurnInteractor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C36015t0 stopAllTurnsInteractor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C36027z0 submitTurnFeedbackInteractor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C36006p createMxmSupportTicketInteractor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C35979b1 turnPollingInteractor;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C37256f turnInterpolationInteractor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C35975a0 getSuggestionsInteractor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C35994j commitRecommendationInteractor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C31381b analyticsHelper;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C35993i0 markTurnAsSeenOrchestrator;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C35999l0 markTurnEndViewedInteractor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C35985e0 markLastViewedTurnInteractor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C34936e turnEndSeenTracker;

    /* JADX INFO: renamed from: ug0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, m65681d2 = {"Lug0/b$a;", "", "<init>", "()V", "", "ATTACHMENT_ERROR_DISPLAY_DELAY_MS", "J", "SUBMIT_ERROR_DISPLAY_DELAY_MS", "SUGGESTIONS_TIMEOUT_MS", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ug0.b$a0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147076w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34933b f147077x;

        public a0(C22669g0 c22669g0, C34933b c34933b) {
            this.f147076w = c22669g0;
            this.f147077x = c34933b;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36011r0 abstractC36011r0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777b;
            C22669g0 c22669g0 = this.f147076w;
            if (AbstractC22676k.m65745e(abstractC36011r0, AbstractC36011r0.b.f153533a)) {
                c33777b = (C33777b) this.f147076w.f89336w;
            } else if (abstractC36011r0 instanceof AbstractC36011r0.c) {
                c33777b = new C33777b(((AbstractC36011r0.c) abstractC36011r0).getConversation(), EnumC14565j.SUCCESS, EnumC26811m.NONE, null, null, null, null, false, false, null, null, false, false, false, null, null, 65464, null);
            } else {
                if (!(abstractC36011r0 instanceof AbstractC36011r0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f147077x.analyticsHelper.m96620a(new AbstractC31380a.i("", true));
                AbstractC36011r0.a aVar = (AbstractC36011r0.a) abstractC36011r0;
                this.f147077x.analyticsHelper.m96620a(new AbstractC31380a.x("", UserState.Sources.USER, "conversation_start", aVar.getMessage(), null, null, 48, null));
                c33777b = new C33777b(null, EnumC14565j.SUCCESS, EnumC26811m.SCREEN_ERROR, aVar.getMessage(), null, null, new C33783h(AbstractC33776a.n.f141405a, new C14567l(UserState.Sources.USER, "conversation_start", aVar.getMessage())), false, false, null, null, false, false, false, null, null, 65456, null);
            }
            c22669g0.f89336w = c33777b;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147078a;

        static {
            int[] iArr = new int[AiMessageStatus.values().length];
            try {
                iArr[AiMessageStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AiMessageStatus.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AiMessageStatus.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AiMessageStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AiMessageStatus.FLAGGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f147078a = iArr;
        }
    }

    /* JADX INFO: renamed from: ug0.b$b0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1287}, m100432m = "handleStopAllTurns", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147079E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f147080F;

        /* JADX INFO: renamed from: H */
        int f147082H;

        /* JADX INFO: renamed from: w */
        Object f147083w;

        /* JADX INFO: renamed from: x */
        Object f147084x;

        /* JADX INFO: renamed from: y */
        Object f147085y;

        /* JADX INFO: renamed from: z */
        Object f147086z;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147080F = obj;
            this.f147082H |= Integer.MIN_VALUE;
            return C34933b.this.m110194a0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$buildConversationPipeline$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {176}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltg0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C33777b f147087E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC13058l f147088F;

        /* JADX INFO: renamed from: w */
        int f147089w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147090x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC33776a f147092z;

        /* JADX INFO: renamed from: ug0.b$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$buildConversationPipeline$1$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {207, 208, 209, 213, 215, 227, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 251, 252, 254}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            Object f147093E;

            /* JADX INFO: renamed from: F */
            Object f147094F;

            /* JADX INFO: renamed from: G */
            Object f147095G;

            /* JADX INFO: renamed from: H */
            Object f147096H;

            /* JADX INFO: renamed from: I */
            Object f147097I;

            /* JADX INFO: renamed from: J */
            Object f147098J;

            /* JADX INFO: renamed from: K */
            Object f147099K;

            /* JADX INFO: renamed from: L */
            Object f147100L;

            /* JADX INFO: renamed from: M */
            int f147101M;

            /* JADX INFO: renamed from: N */
            private /* synthetic */ Object f147102N;

            /* JADX INFO: renamed from: O */
            final /* synthetic */ AbstractC33776a f147103O;

            /* JADX INFO: renamed from: P */
            final /* synthetic */ C34933b f147104P;

            /* JADX INFO: renamed from: Q */
            final /* synthetic */ InterfaceC13062m f147105Q;

            /* JADX INFO: renamed from: R */
            final /* synthetic */ C33777b f147106R;

            /* JADX INFO: renamed from: S */
            final /* synthetic */ InterfaceC13058l f147107S;

            /* JADX INFO: renamed from: w */
            Object f147108w;

            /* JADX INFO: renamed from: x */
            Object f147109x;

            /* JADX INFO: renamed from: y */
            Object f147110y;

            /* JADX INFO: renamed from: z */
            Object f147111z;

            /* JADX INFO: renamed from: ug0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$buildConversationPipeline$1$1$captureJob$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C42464a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f147112w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC13058l f147113x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC11927l f147114y;

                /* JADX INFO: renamed from: ug0.b$c$a$a$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42465a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC11927l f147115w;

                    public C42465a(InterfaceC11927l interfaceC11927l) {
                        this.f147115w = interfaceC11927l;
                    }

                    @Override // ec3.InterfaceC13062m
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object emit(AbstractC33776a abstractC33776a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        Object objMo32219t = this.f147115w.mo32219t(abstractC33776a, interfaceC30057d);
                        return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C42464a(InterfaceC13058l interfaceC13058l, InterfaceC11927l interfaceC11927l, InterfaceC30057d<? super C42464a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f147113x = interfaceC13058l;
                    this.f147114y = interfaceC11927l;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C42464a(this.f147113x, this.f147114y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C42464a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f147112w;
                    try {
                        if (i13 == 0) {
                            AbstractC34132o.m107864I(obj);
                            InterfaceC13058l interfaceC13058l = this.f147113x;
                            C42465a c42465a = new C42465a(this.f147114y);
                            this.f147112w = 1;
                            if (interfaceC13058l.collect(c42465a, this) == enumC31071a) {
                                return enumC31071a;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC34132o.m107864I(obj);
                        }
                        this.f147114y.mo32217r(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th3) {
                        this.f147114y.mo32217r(null);
                        throw th3;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC33776a abstractC33776a, C34933b c34933b, InterfaceC13062m interfaceC13062m, C33777b c33777b, InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f147103O = abstractC33776a;
                this.f147104P = c34933b;
                this.f147105Q = interfaceC13062m;
                this.f147106R = c33777b;
                this.f147107S = interfaceC13058l;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f147103O, this.f147104P, this.f147105Q, this.f147106R, this.f147107S, interfaceC30057d);
                aVar.f147102N = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:69:0x0298 A[PHI: r0 r1 r2 r3 r4 r8 r11 r12 r13
              0x0298: PHI (r0v57 tg0.b) = (r0v34 tg0.b), (r0v60 tg0.b) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r1v62 bc3.k1) = (r1v38 bc3.k1), (r1v64 bc3.k1) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r2v8 bc3.c0) = (r2v1 bc3.c0), (r2v9 bc3.c0) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r3v31 dc3.l) = (r3v15 dc3.l), (r3v34 dc3.l) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r4v38 java.lang.String) = (r4v19 java.lang.String), (r4v40 java.lang.String) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r8v6 int) = (r8v0 int), (r8v7 int) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r11v38 java.lang.String) = (r11v14 java.lang.String), (r11v40 java.lang.String) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r12v19 dc3.c) = (r12v5 dc3.c), (r12v21 dc3.c) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]
              0x0298: PHI (r13v12 java.lang.Object) = (r13v1 java.lang.Object), (r13v22 java.lang.Object) binds: [B:11:0x00f9, B:67:0x0294] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:71:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:73:0x02aa  */
            /* JADX WARN: Code duplicated, block: B:75:0x02b0  */
            /* JADX WARN: Code duplicated, block: B:80:0x02bb  */
            /* JADX WARN: Code duplicated, block: B:81:0x02c3  */
            /* JADX WARN: Code duplicated, block: B:83:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:86:0x02d4  */
            /* JADX WARN: Code duplicated, block: B:88:0x02d7  */
            /* JADX WARN: Code duplicated, block: B:89:0x02dc  */
            /* JADX WARN: Code duplicated, block: B:90:0x02de  */
            /* JADX WARN: Code duplicated, block: B:93:0x02e6  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x03c0 -> B:7:0x0053). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02ae -> B:66:0x0274). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x02b4 -> B:66:0x0274). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02e7 -> B:66:0x0274). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // s83.AbstractC32267a
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instruction units count: 1006
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC33776a abstractC33776a, C33777b c33777b, InterfaceC13058l interfaceC13058l, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147092z = abstractC33776a;
            this.f147087E = c33777b;
            this.f147088F = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C34933b.this.new c(this.f147092z, this.f147087E, this.f147088F, interfaceC30057d);
            cVar.f147090x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147090x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147089w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C34933b.this.markTurnAsSeenOrchestrator.m114312c(this.f147092z);
                a aVar = new a(this.f147092z, C34933b.this, interfaceC13062m, this.f147087E, this.f147088F, null);
                this.f147090x = null;
                this.f147089w = 1;
                if (AbstractC3006f0.m8719m(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$c0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AIConversation f147116w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22669g0 f147117x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33777b f147118y;

        public c0(AIConversation aIConversation, C22669g0 c22669g0, C33777b c33777b) {
            this.f147116w = aIConversation;
            this.f147117x = c22669g0;
            this.f147118y = c33777b;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36017u0 abstractC36017u0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777bM106825a;
            AIConversation aIConversation = this.f147116w;
            List<AITurn> turns = aIConversation.getTurns();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(turns, 10));
            for (AITurn aITurnCopy$default : turns) {
                if (aITurnCopy$default.getTurnStatus() == AiMessageStatus.ACTIVE) {
                    aITurnCopy$default = AITurn.copy$default(aITurnCopy$default, null, AiMessageStatus.STOPPED, null, null, null, false, 61, null);
                }
                arrayList.add(aITurnCopy$default);
            }
            AIConversation aIConversationCopy$default = AIConversation.copy$default(aIConversation, null, arrayList, null, null, null, 29, null);
            C22669g0 c22669g0 = this.f147117x;
            if (AbstractC22676k.m65745e(abstractC36017u0, AbstractC36017u0.b.f153577a)) {
                c33777bM106825a = this.f147118y;
            } else if (abstractC36017u0 instanceof AbstractC36017u0.c) {
                C33777b c33777b = this.f147118y;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : aIConversationCopy$default, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else {
                if (!(abstractC36017u0 instanceof AbstractC36017u0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C33777b c33777b2 = this.f147118y;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : aIConversationCopy$default, (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            }
            c22669g0.f89336w = c33777bM106825a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {427, 428, 429}, m100432m = "emitAttachmentError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147119E;

        /* JADX INFO: renamed from: G */
        int f147121G;

        /* JADX INFO: renamed from: w */
        Object f147122w;

        /* JADX INFO: renamed from: x */
        Object f147123x;

        /* JADX INFO: renamed from: y */
        Object f147124y;

        /* JADX INFO: renamed from: z */
        Object f147125z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147119E = obj;
            this.f147121G |= Integer.MIN_VALUE;
            return C34933b.this.m110181N(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$d0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1335}, m100432m = "handleStopSingleTurn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147126E;

        /* JADX INFO: renamed from: F */
        Object f147127F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f147128G;

        /* JADX INFO: renamed from: I */
        int f147130I;

        /* JADX INFO: renamed from: w */
        Object f147131w;

        /* JADX INFO: renamed from: x */
        Object f147132x;

        /* JADX INFO: renamed from: y */
        Object f147133y;

        /* JADX INFO: renamed from: z */
        Object f147134z;

        public d0(InterfaceC30057d<? super d0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147128G = obj;
            this.f147130I |= Integer.MIN_VALUE;
            return C34933b.this.m110195b0(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {437, 438, 439}, m100432m = "emitSubmitError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147135E;

        /* JADX INFO: renamed from: G */
        int f147137G;

        /* JADX INFO: renamed from: w */
        Object f147138w;

        /* JADX INFO: renamed from: x */
        Object f147139x;

        /* JADX INFO: renamed from: y */
        Object f147140y;

        /* JADX INFO: renamed from: z */
        Object f147141z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147135E = obj;
            this.f147137G |= Integer.MIN_VALUE;
            return C34933b.this.m110182O(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$e0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147142w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33777b f147143x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34933b f147144y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AIConversation f147145z;

        public e0(C22669g0 c22669g0, C33777b c33777b, C34933b c34933b, AIConversation aIConversation) {
            this.f147142w = c22669g0;
            this.f147143x = c33777b;
            this.f147144y = c34933b;
            this.f147145z = aIConversation;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36023x0 abstractC36023x0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777bM106825a;
            C22669g0 c22669g0 = this.f147142w;
            if (AbstractC22676k.m65745e(abstractC36023x0, AbstractC36023x0.b.f153616a)) {
                EnumC26811m enumC26811m = EnumC26811m.MESSAGE_LOADING;
                C33777b c33777b = this.f147143x;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : enumC26811m, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else if (abstractC36023x0 instanceof AbstractC36023x0.c) {
                AIConversation aIConversationM110176I = this.f147144y.m110176I(this.f147145z, ((AbstractC36023x0.c) abstractC36023x0).getTurn());
                C33777b c33777b2 = this.f147143x;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : aIConversationM110176I, (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            } else {
                if (!(abstractC36023x0 instanceof AbstractC36023x0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C33777b c33777b3 = this.f147143x;
                c33777bM106825a = c33777b3.m106825a((65279 & 1) != 0 ? c33777b3.conversation : null, (65279 & 2) != 0 ? c33777b3.messagingState : null, (65279 & 4) != 0 ? c33777b3.loadingState : EnumC26811m.MESSAGE_ERROR, (65279 & 8) != 0 ? c33777b3.error : ((AbstractC36023x0.a) abstractC36023x0).getMessage(), (65279 & 16) != 0 ? c33777b3.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b3.toastStyle : null, (65279 & 64) != 0 ? c33777b3.retryState : null, (65279 & 128) != 0 ? c33777b3.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b3.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b3.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b3.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b3.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b3.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b3.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b3.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b3.pendingFirstContentSeenTurnId : null);
            }
            c22669g0.f89336w = c33777bM106825a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1047}, m100432m = "fetchSuggestions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147146E;

        /* JADX INFO: renamed from: G */
        int f147148G;

        /* JADX INFO: renamed from: w */
        Object f147149w;

        /* JADX INFO: renamed from: x */
        Object f147150x;

        /* JADX INFO: renamed from: y */
        Object f147151y;

        /* JADX INFO: renamed from: z */
        Object f147152z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147146E = obj;
            this.f147148G |= Integer.MIN_VALUE;
            return C34933b.this.m110183P(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$f0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1264, 1273, 1275}, m100432m = "handleStopTurn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147153E;

        /* JADX INFO: renamed from: F */
        Object f147154F;

        /* JADX INFO: renamed from: G */
        Object f147155G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f147156H;

        /* JADX INFO: renamed from: J */
        int f147158J;

        /* JADX INFO: renamed from: w */
        Object f147159w;

        /* JADX INFO: renamed from: x */
        Object f147160x;

        /* JADX INFO: renamed from: y */
        Object f147161y;

        /* JADX INFO: renamed from: z */
        Object f147162z;

        public f0(InterfaceC30057d<? super f0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147156H = obj;
            this.f147158J |= Integer.MIN_VALUE;
            return C34933b.this.m110197c0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1469}, m100432m = "handleCommitRecommendation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147163E;

        /* JADX INFO: renamed from: F */
        Object f147164F;

        /* JADX INFO: renamed from: G */
        Object f147165G;

        /* JADX INFO: renamed from: H */
        Object f147166H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f147167I;

        /* JADX INFO: renamed from: K */
        int f147169K;

        /* JADX INFO: renamed from: w */
        Object f147170w;

        /* JADX INFO: renamed from: x */
        Object f147171x;

        /* JADX INFO: renamed from: y */
        Object f147172y;

        /* JADX INFO: renamed from: z */
        Object f147173z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147167I = obj;
            this.f147169K |= Integer.MIN_VALUE;
            return C34933b.this.m110184Q(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$g0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1388}, m100432m = "handleSubmitTurnFeedback", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147174E;

        /* JADX INFO: renamed from: F */
        Object f147175F;

        /* JADX INFO: renamed from: G */
        Object f147176G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f147177H;

        /* JADX INFO: renamed from: J */
        int f147179J;

        /* JADX INFO: renamed from: w */
        Object f147180w;

        /* JADX INFO: renamed from: x */
        Object f147181x;

        /* JADX INFO: renamed from: y */
        Object f147182y;

        /* JADX INFO: renamed from: z */
        Object f147183z;

        public g0(InterfaceC30057d<? super g0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147177H = obj;
            this.f147179J |= Integer.MIN_VALUE;
            return C34933b.this.m110199d0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$h */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C33777b f147184E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AIConversation f147185F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC13062m f147186G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC33776a.a f147188x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34933b f147189y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f147190z;

        public h(C22669g0 c22669g0, AbstractC33776a.a aVar, C34933b c34933b, String str, C33777b c33777b, AIConversation aIConversation, InterfaceC13062m interfaceC13062m) {
            this.f147187w = c22669g0;
            this.f147188x = aVar;
            this.f147189y = c34933b;
            this.f147190z = str;
            this.f147184E = c33777b;
            this.f147185F = aIConversation;
            this.f147186G = interfaceC13062m;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC35996k abstractC35996k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777bM106825a;
            C22669g0 c22669g0 = this.f147187w;
            if (abstractC35996k instanceof AbstractC35996k.c) {
                if (this.f147188x.getCommitted()) {
                    this.f147189y.analyticsHelper.m96620a(new AbstractC31380a.c(this.f147190z, this.f147188x.getActivityTitle(), false));
                } else {
                    this.f147189y.analyticsHelper.m96620a(new AbstractC31380a.i0(this.f147190z, this.f147188x.getActivityTitle(), false));
                }
                C33777b c33777b = this.f147184E;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : this.f147185F, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else if (abstractC35996k instanceof AbstractC35996k.a) {
                C33777b c33777b2 = this.f147184E;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : null, (65279 & 2) != 0 ? c33777b2.messagingState : EnumC14565j.ERROR, (65279 & 4) != 0 ? c33777b2.loadingState : null, (65279 & 8) != 0 ? c33777b2.error : ((AbstractC35996k.a) abstractC35996k).getMessage(), (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            } else {
                if (!AbstractC22676k.m65745e(abstractC35996k, AbstractC35996k.b.f153437a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c33777bM106825a = this.f147184E;
            }
            c22669g0.f89336w = c33777bM106825a;
            Object objEmit = this.f147186G.emit(this.f147187w.f89336w, interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$h0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f147191E;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AIConversation f147193x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33777b f147194y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13062m f147195z;

        /* JADX INFO: renamed from: ug0.b$h0$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$handleSubmitTurnFeedback$2", m100430f = "AiChatConversationCombiner.kt", m100431l = {1403}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ h0<T> f147196E;

            /* JADX INFO: renamed from: F */
            int f147197F;

            /* JADX INFO: renamed from: w */
            Object f147198w;

            /* JADX INFO: renamed from: x */
            Object f147199x;

            /* JADX INFO: renamed from: y */
            Object f147200y;

            /* JADX INFO: renamed from: z */
            /* synthetic */ Object f147201z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h0<? super T> h0Var, InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
                this.f147196E = h0Var;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f147201z = obj;
                this.f147197F |= Integer.MIN_VALUE;
                return this.f147196E.emit(null, this);
            }
        }

        public h0(AIConversation aIConversation, C33777b c33777b, InterfaceC13062m interfaceC13062m, C22669g0 c22669g0) {
            this.f147193x = aIConversation;
            this.f147194y = c33777b;
            this.f147195z = interfaceC13062m;
            this.f147191E = c22669g0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(C35976a1 c35976a1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar;
            C33777b c33777bM106825a;
            C33777b c33777b;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i13 = aVar.f147197F;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    aVar.f147197F = i13 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, interfaceC30057d);
                }
            } else {
                aVar = new a(this, interfaceC30057d);
            }
            Object obj = aVar.f147201z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = aVar.f147197F;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                AIConversation aIConversationM110227r0 = C34933b.this.m110227r0(this.f147193x, c35976a1.getTurnId(), c35976a1.getFeedback());
                AbstractC17395d toastStyle = c35976a1.getToastStyle();
                C33777b c33777b2 = this.f147194y;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : aIConversationM110227r0, (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : null, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : toastStyle, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
                if (c35976a1.getToastStyle() != null) {
                    InterfaceC13062m interfaceC13062m = this.f147195z;
                    aVar.f147198w = null;
                    aVar.f147199x = null;
                    aVar.f147200y = c33777bM106825a;
                    aVar.f147197F = 1;
                    if (interfaceC13062m.emit(c33777bM106825a, aVar) == enumC31071a) {
                        return enumC31071a;
                    }
                    c33777b = c33777bM106825a;
                }
                this.f147191E.f89336w = c33777bM106825a;
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c33777b = (C33777b) aVar.f147200y;
            AbstractC34132o.m107864I(obj);
            c33777bM106825a = c33777b;
            this.f147191E.f89336w = c33777bM106825a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {445, 468, 523, 532, 534, 556}, m100432m = "handleCreateConversation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147202E;

        /* JADX INFO: renamed from: F */
        Object f147203F;

        /* JADX INFO: renamed from: G */
        int f147204G;

        /* JADX INFO: renamed from: H */
        int f147205H;

        /* JADX INFO: renamed from: I */
        int f147206I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f147207J;

        /* JADX INFO: renamed from: L */
        int f147209L;

        /* JADX INFO: renamed from: w */
        Object f147210w;

        /* JADX INFO: renamed from: x */
        Object f147211x;

        /* JADX INFO: renamed from: y */
        Object f147212y;

        /* JADX INFO: renamed from: z */
        Object f147213z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147207J = obj;
            this.f147209L |= Integer.MIN_VALUE;
            return C34933b.this.m110185R(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$i0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147214w;

        /* JADX INFO: renamed from: ug0.b$i0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147215w;

            /* JADX INFO: renamed from: ug0.b$i0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$interact$$inlined$filter$1$2", m100430f = "AiChatConversationCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42466a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f147217F;

                /* JADX INFO: renamed from: G */
                Object f147218G;

                /* JADX INFO: renamed from: H */
                int f147219H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147220w;

                /* JADX INFO: renamed from: x */
                int f147221x;

                /* JADX INFO: renamed from: y */
                Object f147222y;

                /* JADX INFO: renamed from: z */
                Object f147223z;

                public C42466a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147220w = obj;
                    this.f147221x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f147215w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42466a c42466a;
                if (interfaceC30057d instanceof C42466a) {
                    c42466a = (C42466a) interfaceC30057d;
                    int i13 = c42466a.f147221x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42466a.f147221x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42466a = new C42466a(interfaceC30057d);
                    }
                } else {
                    c42466a = new C42466a(interfaceC30057d);
                }
                Object obj2 = c42466a.f147220w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42466a.f147221x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f147215w;
                    if (((AbstractC33776a) obj) instanceof InterfaceC33779d) {
                        c42466a.f147222y = null;
                        c42466a.f147223z = null;
                        c42466a.f147217F = null;
                        c42466a.f147218G = null;
                        c42466a.f147219H = 0;
                        c42466a.f147221x = 1;
                        if (interfaceC13062m.emit(obj, c42466a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public i0(InterfaceC13058l interfaceC13058l) {
            this.f147214w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147214w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$j */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147224w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC33776a.b f147225x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34933b f147226y;

        public j(C22669g0 c22669g0, AbstractC33776a.b bVar, C34933b c34933b) {
            this.f147224w = c22669g0;
            this.f147225x = bVar;
            this.f147226y = c34933b;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36002n abstractC36002n, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777b;
            C22669g0 c22669g0 = this.f147224w;
            if (AbstractC22676k.m65745e(abstractC36002n, AbstractC36002n.b.f153482a)) {
                c33777b = new C33777b(null, EnumC14565j.SUCCESS, EnumC26811m.SCREEN_LOADING, null, null, null, null, false, false, null, null, false, false, this.f147225x.getIsDay0(), null, null, 57264, null);
            } else if (abstractC36002n instanceof AbstractC36002n.c) {
                c33777b = new C33777b(((AbstractC36002n.c) abstractC36002n).getConversation(), EnumC14565j.SUCCESS, EnumC26811m.NONE, null, null, null, null, false, false, null, null, this.f147225x.getOpenedFromHistory(), false, this.f147225x.getIsDay0(), null, null, 55224, null);
            } else {
                if (!(abstractC36002n instanceof AbstractC36002n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f147226y.analyticsHelper.m96620a(new AbstractC31380a.i("", true));
                AbstractC36002n.a aVar = (AbstractC36002n.a) abstractC36002n;
                this.f147226y.analyticsHelper.m96620a(new AbstractC31380a.x("", UserState.Sources.USER, "conversation_start", aVar.getMessage(), null, null, 48, null));
                c33777b = new C33777b(null, EnumC14565j.SUCCESS, EnumC26811m.SCREEN_ERROR, aVar.getMessage(), null, null, new C33783h(this.f147225x, new C14567l(UserState.Sources.USER, "conversation_start", aVar.getMessage())), false, false, null, null, false, false, false, null, null, 65456, null);
            }
            c22669g0.f89336w = c33777b;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$j0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147227w;

        /* JADX INFO: renamed from: ug0.b$j0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147228w;

            /* JADX INFO: renamed from: ug0.b$j0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$interact$$inlined$filter$2$2", m100430f = "AiChatConversationCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42467a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f147230F;

                /* JADX INFO: renamed from: G */
                Object f147231G;

                /* JADX INFO: renamed from: H */
                int f147232H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147233w;

                /* JADX INFO: renamed from: x */
                int f147234x;

                /* JADX INFO: renamed from: y */
                Object f147235y;

                /* JADX INFO: renamed from: z */
                Object f147236z;

                public C42467a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147233w = obj;
                    this.f147234x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f147228w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42467a c42467a;
                if (interfaceC30057d instanceof C42467a) {
                    c42467a = (C42467a) interfaceC30057d;
                    int i13 = c42467a.f147234x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42467a.f147234x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42467a = new C42467a(interfaceC30057d);
                    }
                } else {
                    c42467a = new C42467a(interfaceC30057d);
                }
                Object obj2 = c42467a.f147233w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42467a.f147234x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f147228w;
                    if (!(((AbstractC33776a) obj) instanceof InterfaceC33779d)) {
                        c42467a.f147235y = null;
                        c42467a.f147236z = null;
                        c42467a.f147230F = null;
                        c42467a.f147231G = null;
                        c42467a.f147232H = 0;
                        c42467a.f147234x = 1;
                        if (interfaceC13062m.emit(obj, c42467a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public j0(InterfaceC13058l interfaceC13058l) {
            this.f147227w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147227w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1426, 1441}, m100432m = "handleCreateMxmSupportTicket", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147237E;

        /* JADX INFO: renamed from: F */
        Object f147238F;

        /* JADX INFO: renamed from: G */
        Object f147239G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f147240H;

        /* JADX INFO: renamed from: J */
        int f147242J;

        /* JADX INFO: renamed from: w */
        Object f147243w;

        /* JADX INFO: renamed from: x */
        Object f147244x;

        /* JADX INFO: renamed from: y */
        Object f147245y;

        /* JADX INFO: renamed from: z */
        Object f147246z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147240H = obj;
            this.f147242J |= Integer.MIN_VALUE;
            return C34933b.this.m110186S(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$k0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$interact$$inlined$flatMapLatest$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC13058l f147247E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C22669g0 f147248F;

        /* JADX INFO: renamed from: w */
        int f147249w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147250x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f147251y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34933b f147252z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(InterfaceC30057d interfaceC30057d, C34933b c34933b, InterfaceC13058l interfaceC13058l, C22669g0 c22669g0) {
            super(3, interfaceC30057d);
            this.f147252z = c34933b;
            this.f147247E = interfaceC13058l;
            this.f147248F = c22669g0;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC33776a abstractC33776a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            k0 k0Var = new k0(interfaceC30057d, this.f147252z, this.f147247E, this.f147248F);
            k0Var.f147250x = interfaceC13062m;
            k0Var.f147251y = abstractC33776a;
            return k0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147249w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f147250x;
                InterfaceC13058l interfaceC13058lM110178K = this.f147252z.m110178K((AbstractC33776a) this.f147251y, this.f147247E, (C33777b) this.f147248F.f89336w);
                l0 l0Var = new l0(this.f147248F, null);
                this.f147250x = null;
                this.f147251y = null;
                this.f147249w = 1;
                AbstractC13091v.m36615y(interfaceC13062m);
                Object objCollect = interfaceC13058lM110178K.collect(new C13031e0(2, interfaceC13062m, l0Var), this);
                if (objCollect != EnumC31071a.f128113w) {
                    objCollect = c23454a0;
                }
                if (objCollect != EnumC31071a.f128113w) {
                    objCollect = c23454a0;
                }
                if (objCollect == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC33776a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ug0.b$l */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC33776a.c f147253E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147254w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34933b f147255x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C33777b f147256y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AIConversation f147257z;

        public l(C22669g0 c22669g0, C34933b c34933b, C33777b c33777b, AIConversation aIConversation, AbstractC33776a.c cVar) {
            this.f147254w = c22669g0;
            this.f147255x = c34933b;
            this.f147256y = c33777b;
            this.f147257z = aIConversation;
            this.f147253E = cVar;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36008q abstractC36008q, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            this.f147254w.f89336w = this.f147255x.m110205g0(abstractC36008q, this.f147256y, this.f147257z, this.f147253E);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$l0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$interact$conversationPipeline$1$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ltg0/b;", "result", "Ll83/a0;", "<anonymous>", "(Ltg0/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147258w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f147259x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22669g0 f147260y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(C22669g0 c22669g0, InterfaceC30057d<? super l0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147260y = c22669g0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l0 l0Var = new l0(this.f147260y, interfaceC30057d);
            l0Var.f147259x = obj;
            return l0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C33777b c33777b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l0) create(c33777b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C33777b c33777b = (C33777b) this.f147259x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f147258w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f147260y.f89336w = c33777b;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$m */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {776, 808, 900}, m100432m = "handleCreateTurn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147261E;

        /* JADX INFO: renamed from: F */
        Object f147262F;

        /* JADX INFO: renamed from: G */
        Object f147263G;

        /* JADX INFO: renamed from: H */
        Object f147264H;

        /* JADX INFO: renamed from: I */
        Object f147265I;

        /* JADX INFO: renamed from: J */
        Object f147266J;

        /* JADX INFO: renamed from: K */
        Object f147267K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f147268L;

        /* JADX INFO: renamed from: N */
        int f147270N;

        /* JADX INFO: renamed from: w */
        Object f147271w;

        /* JADX INFO: renamed from: x */
        Object f147272x;

        /* JADX INFO: renamed from: y */
        Object f147273y;

        /* JADX INFO: renamed from: z */
        Object f147274z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147268L = obj;
            this.f147270N |= Integer.MIN_VALUE;
            return C34933b.this.m110187T(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$m0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1079}, m100432m = "launchRequestedSideEffects", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147275E;

        /* JADX INFO: renamed from: F */
        Object f147276F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f147277G;

        /* JADX INFO: renamed from: I */
        int f147279I;

        /* JADX INFO: renamed from: w */
        Object f147280w;

        /* JADX INFO: renamed from: x */
        Object f147281x;

        /* JADX INFO: renamed from: y */
        Object f147282y;

        /* JADX INFO: renamed from: z */
        Object f147283z;

        public m0(InterfaceC30057d<? super m0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147277G = obj;
            this.f147279I |= Integer.MIN_VALUE;
            return C34933b.this.m110203f0(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$n */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f147284E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC13062m f147285F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147286w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AIConversation f147287x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34933b f147288y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC33776a.d f147289z;

        public n(C22669g0 c22669g0, AIConversation aIConversation, C34933b c34933b, AbstractC33776a.d dVar, C22669g0 c22669g1, InterfaceC13062m interfaceC13062m) {
            this.f147286w = c22669g0;
            this.f147287x = aIConversation;
            this.f147288y = c34933b;
            this.f147289z = dVar;
            this.f147284E = c22669g1;
            this.f147285F = interfaceC13062m;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36014t abstractC36014t, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            String fingerprint;
            C33777b c33777bM106825a;
            AIConversationMetadata metadata;
            T next;
            String id4;
            int i13;
            C22669g0 c22669g0 = this.f147286w;
            boolean z4 = abstractC36014t instanceof AbstractC36014t.c;
            C25271y c25271y = C25271y.f99162w;
            if (z4) {
                AIConversation conversation = ((C33777b) c22669g0.f89336w).getConversation();
                if (conversation == null) {
                    conversation = this.f147287x;
                }
                AbstractC36014t.c cVar = (AbstractC36014t.c) abstractC36014t;
                AIConversation aIConversationM110176I = this.f147288y.m110176I(conversation, cVar.getTurn());
                String fingerprint2 = aIConversationM110176I.getMetadata().getFingerprint();
                Iterator<T> it = cVar.getTurn().getMessages().iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC38269a.m122610c((AIMessage) next));
                AIMessage aIMessage = next;
                if (aIMessage == null || (id4 = aIMessage.getId()) == null) {
                    id4 = cVar.getTurn().getId();
                }
                String str = id4;
                Iterator<T> it3 = aIConversationM110176I.getTurns().iterator();
                int i14 = 0;
                while (it3.hasNext()) {
                    List<AIMessage> messages = ((AITurn) it3.next()).getMessages();
                    if ((messages instanceof Collection) && messages.isEmpty()) {
                        i13 = 0;
                    } else {
                        Iterator<T> it4 = messages.iterator();
                        i13 = 0;
                        while (it4.hasNext()) {
                            if (AbstractC38269a.m122610c((AIMessage) it4.next()) && (i13 = i13 + 1) < 0) {
                                AbstractC37056f.m118976c0();
                                throw null;
                            }
                        }
                    }
                    i14 += i13;
                }
                AIConversation aIConversationM110215l0 = this.f147288y.m110215l0(aIConversationM110176I);
                this.f147288y.analyticsHelper.m96620a(new AbstractC31380a.v(fingerprint2, i14, str, false, this.f147289z.getIsSuggestion()));
                C33777b c33777b = (C33777b) this.f147286w.f89336w;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : aIConversationM110215l0, (65279 & 2) != 0 ? c33777b.messagingState : EnumC14565j.LOADING, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : c25271y, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else if (AbstractC22676k.m65745e(abstractC36014t, AbstractC36014t.b.f153555a)) {
                C33777b c33777b2 = (C33777b) this.f147286w.f89336w;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : null, (65279 & 2) != 0 ? c33777b2.messagingState : EnumC14565j.LOADING, (65279 & 4) != 0 ? c33777b2.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : c25271y, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            } else if (abstractC36014t instanceof AbstractC36014t.d) {
                AbstractC36014t.d dVar = (AbstractC36014t.d) abstractC36014t;
                this.f147284E.f89336w = dVar.getTurn().getId();
                AIConversation conversation2 = ((C33777b) this.f147286w.f89336w).getConversation();
                if (conversation2 == null) {
                    conversation2 = this.f147287x;
                }
                AIConversation aIConversationM110219n0 = this.f147288y.m110219n0(conversation2, dVar.getTurn());
                C33777b c33777b3 = (C33777b) this.f147286w.f89336w;
                c33777bM106825a = c33777b3.m106825a((65279 & 1) != 0 ? c33777b3.conversation : aIConversationM110219n0, (65279 & 2) != 0 ? c33777b3.messagingState : EnumC14565j.SUCCESS, (65279 & 4) != 0 ? c33777b3.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b3.error : null, (65279 & 16) != 0 ? c33777b3.attachmentUploadModels : c25271y, (65279 & 32) != 0 ? c33777b3.toastStyle : null, (65279 & 64) != 0 ? c33777b3.retryState : null, (65279 & 128) != 0 ? c33777b3.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b3.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b3.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b3.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b3.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b3.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b3.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b3.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b3.pendingFirstContentSeenTurnId : null);
            } else {
                if (!(abstractC36014t instanceof AbstractC36014t.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                AIConversation conversation3 = ((C33777b) this.f147286w.f89336w).getConversation();
                if (conversation3 == null || (metadata = conversation3.getMetadata()) == null || (fingerprint = metadata.getFingerprint()) == null) {
                    fingerprint = "";
                }
                String str2 = fingerprint;
                this.f147288y.analyticsHelper.m96620a(new AbstractC31380a.i(str2, true));
                AbstractC36014t.a aVar = (AbstractC36014t.a) abstractC36014t;
                this.f147288y.analyticsHelper.m96620a(new AbstractC31380a.x(str2, UserState.Sources.USER, "text", aVar.getMessage(), null, null, 48, null));
                C33777b c33777b4 = (C33777b) this.f147286w.f89336w;
                c33777bM106825a = c33777b4.m106825a((65279 & 1) != 0 ? c33777b4.conversation : null, (65279 & 2) != 0 ? c33777b4.messagingState : EnumC14565j.ERROR, (65279 & 4) != 0 ? c33777b4.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b4.error : aVar.getMessage(), (65279 & 16) != 0 ? c33777b4.attachmentUploadModels : c25271y, (65279 & 32) != 0 ? c33777b4.toastStyle : null, (65279 & 64) != 0 ? c33777b4.retryState : new C33783h(this.f147289z, new C14567l(UserState.Sources.USER, "text", aVar.getMessage())), (65279 & 128) != 0 ? c33777b4.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b4.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b4.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b4.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b4.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b4.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b4.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b4.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b4.pendingFirstContentSeenTurnId : null);
            }
            c22669g0.f89336w = c33777bM106825a;
            Object objEmit = this.f147285F.emit(this.f147286w.f89336w, interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$n0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$launchRequestedSideEffects$2$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {1073}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147290w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f147292y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f147293z;

        /* JADX INFO: renamed from: ug0.b$n0$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$launchRequestedSideEffects$2$1$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {1074}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f147294w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34933b f147295x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f147296y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f147297z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C34933b c34933b, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f147295x = c34933b;
                this.f147296y = str;
                this.f147297z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f147295x, this.f147296y, this.f147297z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f147294w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C35993i0 c35993i0 = this.f147295x.markTurnAsSeenOrchestrator;
                    String str = this.f147296y;
                    String str2 = this.f147297z;
                    this.f147294w = 1;
                    if (c35993i0.m114313d(str, str2, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(String str, String str2, InterfaceC30057d<? super n0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147292y = str;
            this.f147293z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34933b.this.new n0(this.f147292y, this.f147293z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147290w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C3075y1 c3075y1 = C3075y1.f12109w;
                a aVar = new a(C34933b.this, this.f147292y, this.f147293z, null);
                this.f147290w = 1;
                if (AbstractC3006f0.m8705K(c3075y1, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$o */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1187, 1219, 1222, 1236, 1237}, m100432m = "handleFileAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147298E;

        /* JADX INFO: renamed from: F */
        Object f147299F;

        /* JADX INFO: renamed from: G */
        Object f147300G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f147301H;

        /* JADX INFO: renamed from: J */
        int f147303J;

        /* JADX INFO: renamed from: w */
        Object f147304w;

        /* JADX INFO: renamed from: x */
        Object f147305x;

        /* JADX INFO: renamed from: y */
        Object f147306y;

        /* JADX INFO: renamed from: z */
        Object f147307z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147301H = obj;
            this.f147303J |= Integer.MIN_VALUE;
            return C34933b.this.m110188U(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$o0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$launchRequestedSideEffects$3", m100430f = "AiChatConversationCombiner.kt", m100431l = {1081}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC11939x f147308E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f147309F;

        /* JADX INFO: renamed from: w */
        int f147310w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f147311x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f147313z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(String str, InterfaceC11939x interfaceC11939x, String str2, InterfaceC30057d<? super o0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147313z = str;
            this.f147308E = interfaceC11939x;
            this.f147309F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o0 o0Var = C34933b.this.new o0(this.f147313z, this.f147308E, this.f147309F, interfaceC30057d);
            o0Var.f147311x = obj;
            return o0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f147311x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147310w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C35975a0 c35975a0 = C34933b.this.getSuggestionsInteractor;
                String str = this.f147313z;
                Long l7 = new Long(ChatClient.RESOLVE_DEPENDENCY_TIMEOUT);
                this.f147311x = interfaceC2994c0;
                this.f147310w = 1;
                obj = c35975a0.m114220d(str, l7, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            List list = (List) obj;
            if (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                this.f147308E.mo32218s(new AbstractC33776a.q(this.f147313z, this.f147309F, list));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$p */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147314w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13062m f147315x;

        public p(C22669g0 c22669g0, InterfaceC13062m interfaceC13062m) {
            this.f147314w = c22669g0;
            this.f147315x = interfaceC13062m;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C38271c> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            T next;
            C22669g0 c22669g0 = this.f147314w;
            Object obj = c22669g0.f89336w;
            C33777b c33777b = (C33777b) obj;
            List<C38271c> listM106827d = ((C33777b) obj).m106827d();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM106827d, 10));
            for (C38271c c38271c : listM106827d) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C38271c) next).getUri(), c38271c.getUri()));
                C38271c c38271c2 = next;
                if (c38271c2 != null) {
                    c38271c = c38271c2;
                }
                arrayList.add(c38271c);
            }
            c22669g0.f89336w = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : arrayList, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            Object objEmit = this.f147315x.emit(this.f147314w.f89336w, interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$p0 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f147316w;

        /* JADX INFO: renamed from: ug0.b$p0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f147317w;

            /* JADX INFO: renamed from: ug0.b$p0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$pollIfNeeded$$inlined$map$1$2", m100430f = "AiChatConversationCombiner.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42468a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f147318E;

                /* JADX INFO: renamed from: F */
                Object f147319F;

                /* JADX INFO: renamed from: G */
                Object f147320G;

                /* JADX INFO: renamed from: H */
                int f147321H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f147322w;

                /* JADX INFO: renamed from: x */
                int f147323x;

                /* JADX INFO: renamed from: y */
                Object f147324y;

                public C42468a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f147322w = obj;
                    this.f147323x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f147317w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42468a c42468a;
                if (interfaceC30057d instanceof C42468a) {
                    c42468a = (C42468a) interfaceC30057d;
                    int i13 = c42468a.f147323x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42468a.f147323x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42468a = new C42468a(interfaceC30057d);
                    }
                } else {
                    c42468a = new C42468a(interfaceC30057d);
                }
                Object obj2 = c42468a.f147322w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42468a.f147323x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f147317w;
                    C37257g c37257g = new C37257g((AITurn) obj);
                    c42468a.f147324y = null;
                    c42468a.f147318E = null;
                    c42468a.f147319F = null;
                    c42468a.f147320G = null;
                    c42468a.f147321H = 0;
                    c42468a.f147323x = 1;
                    if (interfaceC13062m.emit(c37257g, c42468a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public p0(InterfaceC13058l interfaceC13058l) {
            this.f147316w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f147316w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$q */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        public static final q<T> f147326w = new q<>();

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C38271c> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$q0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {940, 1021}, m100432m = "pollIfNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147327E;

        /* JADX INFO: renamed from: F */
        Object f147328F;

        /* JADX INFO: renamed from: G */
        Object f147329G;

        /* JADX INFO: renamed from: H */
        Object f147330H;

        /* JADX INFO: renamed from: I */
        Object f147331I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f147332J;

        /* JADX INFO: renamed from: L */
        int f147334L;

        /* JADX INFO: renamed from: w */
        Object f147335w;

        /* JADX INFO: renamed from: x */
        Object f147336x;

        /* JADX INFO: renamed from: y */
        Object f147337y;

        /* JADX INFO: renamed from: z */
        Object f147338z;

        public q0(InterfaceC30057d<? super q0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147332J = obj;
            this.f147334L |= Integer.MIN_VALUE;
            return C34933b.this.m110209i0(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$r */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {648, 662, 729}, m100432m = "handleGetConversationTurn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147339E;

        /* JADX INFO: renamed from: F */
        Object f147340F;

        /* JADX INFO: renamed from: G */
        Object f147341G;

        /* JADX INFO: renamed from: H */
        Object f147342H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f147343I;

        /* JADX INFO: renamed from: K */
        int f147345K;

        /* JADX INFO: renamed from: w */
        Object f147346w;

        /* JADX INFO: renamed from: x */
        Object f147347x;

        /* JADX INFO: renamed from: y */
        Object f147348y;

        /* JADX INFO: renamed from: z */
        Object f147349z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147343I = obj;
            this.f147345K |= Integer.MIN_VALUE;
            return C34933b.this.m110189V(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$r0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$pollIfNeeded$4", m100430f = "AiChatConversationCombiner.kt", m100431l = {959, 970}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lwg0/h;", "interpolationResult", "Ll83/a0;", "<anonymous>", "(Lwg0/h;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f147350E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ AIConversation f147351F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C34933b f147352G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C22659b0 f147353H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f147354I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ String f147355J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC13062m f147356K;

        /* JADX INFO: renamed from: w */
        Object f147357w;

        /* JADX INFO: renamed from: x */
        Object f147358x;

        /* JADX INFO: renamed from: y */
        int f147359y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f147360z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(C22669g0 c22669g0, AIConversation aIConversation, C34933b c34933b, C22659b0 c22659b0, String str, String str2, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super r0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147350E = c22669g0;
            this.f147351F = aIConversation;
            this.f147352G = c34933b;
            this.f147353H = c22659b0;
            this.f147354I = str;
            this.f147355J = str2;
            this.f147356K = interfaceC13062m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r0 r0Var = new r0(this.f147350E, this.f147351F, this.f147352G, this.f147353H, this.f147354I, this.f147355J, this.f147356K, interfaceC30057d);
            r0Var.f147360z = obj;
            return r0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C37258h c37258h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r0) create(c37258h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ce, code lost:
        
            if (r1.emit(r3, r26) == r2) goto L28;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.r0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ug0.b$s */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC33776a.f f147361E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147362w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33777b f147363x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34933b f147364y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AIConversation f147365z;

        public s(C22669g0 c22669g0, C33777b c33777b, C34933b c34933b, AIConversation aIConversation, AbstractC33776a.f fVar) {
            this.f147362w = c22669g0;
            this.f147363x = c33777b;
            this.f147364y = c34933b;
            this.f147365z = aIConversation;
            this.f147361E = fVar;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36026z abstractC36026z, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777bM106825a;
            T next;
            String id4;
            C22669g0 c22669g0 = this.f147362w;
            if (AbstractC22676k.m65745e(abstractC36026z, AbstractC36026z.b.f153639a)) {
                EnumC26811m enumC26811m = EnumC26811m.MESSAGE_LOADING;
                C33777b c33777b = this.f147363x;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : enumC26811m, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else if (abstractC36026z instanceof AbstractC36026z.c) {
                AbstractC36026z.c cVar = (AbstractC36026z.c) abstractC36026z;
                AIConversation aIConversationM110176I = this.f147364y.m110176I(this.f147365z, cVar.getTurn());
                if (cVar.getTurn().getTurnStatus() == AiMessageStatus.COMPLETE) {
                    String fingerprint = aIConversationM110176I.getMetadata().getFingerprint();
                    Iterator<T> it = cVar.getTurn().getMessages().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((AIMessage) next).getRole(), EnumC26800b.ASSISTANT.getValue()));
                    AIMessage aIMessage = next;
                    if (aIMessage == null || (id4 = aIMessage.getId()) == null) {
                        id4 = cVar.getTurn().getId();
                    }
                    this.f147364y.analyticsHelper.m96620a(new AbstractC31380a.b(fingerprint, id4));
                }
                C33777b c33777b2 = this.f147363x;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : aIConversationM110176I, (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            } else {
                if (!(abstractC36026z instanceof AbstractC36026z.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                String fingerprint2 = this.f147363x.getConversation().getMetadata().getFingerprint();
                this.f147364y.analyticsHelper.m96620a(new AbstractC31380a.i(fingerprint2, true));
                AbstractC36026z.a aVar = (AbstractC36026z.a) abstractC36026z;
                this.f147364y.analyticsHelper.m96620a(new AbstractC31380a.x(fingerprint2, "assistant", "text", aVar.getMessage(), null, null, 48, null));
                C33777b c33777b3 = this.f147363x;
                c33777bM106825a = c33777b3.m106825a((65279 & 1) != 0 ? c33777b3.conversation : null, (65279 & 2) != 0 ? c33777b3.messagingState : null, (65279 & 4) != 0 ? c33777b3.loadingState : EnumC26811m.MESSAGE_ERROR, (65279 & 8) != 0 ? c33777b3.error : aVar.getMessage(), (65279 & 16) != 0 ? c33777b3.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b3.toastStyle : null, (65279 & 64) != 0 ? c33777b3.retryState : new C33783h(this.f147361E, new C14567l("assistant", "text", aVar.getMessage())), (65279 & 128) != 0 ? c33777b3.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b3.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b3.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b3.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b3.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b3.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b3.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b3.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b3.pendingFirstContentSeenTurnId : null);
            }
            c22669g0.f89336w = c33777bM106825a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$s0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$pollIfNeeded$5", m100430f = "AiChatConversationCombiner.kt", m100431l = {MessageListItemViewType.START_OF_THE_CHANNEL}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lwg0/h;", "", "cause", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C22669g0 f147366E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C34933b f147367F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f147368G;

        /* JADX INFO: renamed from: w */
        Object f147369w;

        /* JADX INFO: renamed from: x */
        Object f147370x;

        /* JADX INFO: renamed from: y */
        int f147371y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f147372z;

        /* JADX INFO: renamed from: ug0.b$s0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f147373a;

            static {
                int[] iArr = new int[AiMessageStatus.values().length];
                try {
                    iArr[AiMessageStatus.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AiMessageStatus.FLAGGED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AiMessageStatus.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AiMessageStatus.STOPPED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AiMessageStatus.COMPLETE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f147373a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(C22669g0 c22669g0, C34933b c34933b, String str, InterfaceC30057d<? super s0> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f147366E = c22669g0;
            this.f147367F = c34933b;
            this.f147368G = str;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            s0 s0Var = new s0(this.f147366E, this.f147367F, this.f147368G, interfaceC30057d);
            s0Var.f147372z = th3;
            return s0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22669g0 c22669g0;
            Object objM110183P;
            String fingerprint;
            Object next;
            String id4;
            AIConversationMetadata metadata;
            List<AITurn> turns;
            Throwable th3 = (Throwable) this.f147372z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147371y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (th3 == null) {
                    C22669g0 c22669g1 = this.f147366E;
                    C33777b c33777b = (C33777b) c22669g1.f89336w;
                    c22669g1.f89336w = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : true, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
                    AIConversation conversation = ((C33777b) this.f147366E.f89336w).getConversation();
                    AITurn aITurn = (conversation == null || (turns = conversation.getTurns()) == null) ? null : (AITurn) AbstractC25265s.m74114R0(turns);
                    AiMessageStatus turnStatus = aITurn != null ? aITurn.getTurnStatus() : null;
                    int i14 = turnStatus == null ? -1 : a.f147373a[turnStatus.ordinal()];
                    if (i14 != -1 && i14 != 1) {
                        if (i14 != 2) {
                            if (i14 != 3) {
                                if (i14 != 4 && i14 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (aITurn.getTurnStatus() == AiMessageStatus.COMPLETE) {
                                    AIConversation conversation2 = ((C33777b) this.f147366E.f89336w).getConversation();
                                    if (conversation2 == null || (metadata = conversation2.getMetadata()) == null || (fingerprint = metadata.getFingerprint()) == null) {
                                        fingerprint = "";
                                    }
                                    Iterator<T> it = aITurn.getMessages().iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (!AbstractC22676k.m65745e(((AIMessage) next).getRole(), EnumC26800b.ASSISTANT.getValue()));
                                    AIMessage aIMessage = (AIMessage) next;
                                    if (aIMessage == null || (id4 = aIMessage.getId()) == null) {
                                        id4 = aITurn.getId();
                                    }
                                    this.f147367F.analyticsHelper.m96620a(new AbstractC31380a.b(fingerprint, id4));
                                }
                                c22669g0 = this.f147366E;
                                C34933b c34933b = this.f147367F;
                                C33777b c33777b2 = (C33777b) c22669g0.f89336w;
                                String str = this.f147368G;
                                this.f147372z = null;
                                this.f147369w = null;
                                this.f147370x = c22669g0;
                                this.f147371y = 1;
                                objM110183P = c34933b.m110183P(c33777b2, str, this);
                                if (objM110183P == enumC31071a) {
                                    return enumC31071a;
                                }
                            } else if (AbstractC38270b.m122611a(aITurn)) {
                                C22669g0 c22669g2 = this.f147366E;
                                C33777b c33777b3 = (C33777b) c22669g2.f89336w;
                                c22669g2.f89336w = c33777b3.m106825a((65279 & 1) != 0 ? c33777b3.conversation : null, (65279 & 2) != 0 ? c33777b3.messagingState : EnumC14565j.ERROR, (65279 & 4) != 0 ? c33777b3.loadingState : null, (65279 & 8) != 0 ? c33777b3.error : null, (65279 & 16) != 0 ? c33777b3.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b3.toastStyle : null, (65279 & 64) != 0 ? c33777b3.retryState : null, (65279 & 128) != 0 ? c33777b3.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b3.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b3.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b3.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b3.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b3.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b3.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b3.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b3.pendingFirstContentSeenTurnId : null);
                            }
                        } else if (AbstractC38270b.m122611a(aITurn)) {
                            C22669g0 c22669g3 = this.f147366E;
                            C33777b c33777b4 = (C33777b) c22669g3.f89336w;
                            c22669g3.f89336w = c33777b4.m106825a((65279 & 1) != 0 ? c33777b4.conversation : null, (65279 & 2) != 0 ? c33777b4.messagingState : EnumC14565j.FLAGGED, (65279 & 4) != 0 ? c33777b4.loadingState : null, (65279 & 8) != 0 ? c33777b4.error : null, (65279 & 16) != 0 ? c33777b4.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b4.toastStyle : null, (65279 & 64) != 0 ? c33777b4.retryState : null, (65279 & 128) != 0 ? c33777b4.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b4.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b4.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b4.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b4.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b4.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b4.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b4.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b4.pendingFirstContentSeenTurnId : null);
                        }
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) this.f147370x;
            AbstractC34132o.m107864I(obj);
            objM110183P = obj;
            c22669g0.f89336w = objM110183P;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$t */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {1112, 1131, 1163, 1165}, m100432m = "handleImageAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147374E;

        /* JADX INFO: renamed from: F */
        Object f147375F;

        /* JADX INFO: renamed from: G */
        Object f147376G;

        /* JADX INFO: renamed from: H */
        Object f147377H;

        /* JADX INFO: renamed from: I */
        Object f147378I;

        /* JADX INFO: renamed from: J */
        Object f147379J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f147380K;

        /* JADX INFO: renamed from: M */
        int f147382M;

        /* JADX INFO: renamed from: w */
        Object f147383w;

        /* JADX INFO: renamed from: x */
        Object f147384x;

        /* JADX INFO: renamed from: y */
        Object f147385y;

        /* JADX INFO: renamed from: z */
        Object f147386z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147380K = obj;
            this.f147382M |= Integer.MIN_VALUE;
            return C34933b.this.m110190W(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$t0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {272, 273, 274, 275, 277, 280, 282, DfuBaseService.NOTIFICATION_ID, 284, 304, 306}, m100432m = "processAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147387E;

        /* JADX INFO: renamed from: G */
        int f147389G;

        /* JADX INFO: renamed from: w */
        Object f147390w;

        /* JADX INFO: renamed from: x */
        Object f147391x;

        /* JADX INFO: renamed from: y */
        Object f147392y;

        /* JADX INFO: renamed from: z */
        Object f147393z;

        public t0(InterfaceC30057d<? super t0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147387E = obj;
            this.f147389G |= Integer.MIN_VALUE;
            return C34933b.this.m110213k0(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$u */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C33777b f147394w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22669g0 f147395x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C38271c> f147396y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13062m f147397z;

        public u(C33777b c33777b, C22669g0 c22669g0, List<C38271c> list, InterfaceC13062m interfaceC13062m) {
            this.f147394w = c33777b;
            this.f147395x = c22669g0;
            this.f147396y = list;
            this.f147397z = interfaceC13062m;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C38271c> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            List<C38271c> listM106827d = this.f147394w.m106827d();
            ArrayList arrayList = new ArrayList();
            for (T t14 : listM106827d) {
                if (((C38271c) t14).getType() == AttachmentType.IMAGE) {
                    arrayList.add(t14);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C38271c c38271c = (C38271c) obj;
                List<C38271c> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (!AbstractC22676k.m65745e(((C38271c) it.next()).getUri(), c38271c.getUri()));
                }
                arrayList2.add(obj);
            }
            C22669g0 c22669g0 = this.f147395x;
            C33777b c33777b = this.f147394w;
            c22669g0.f89336w = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(this.f147396y, arrayList2), list), (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            Object objEmit = this.f147397z.emit(this.f147395x.f89336w, interfaceC30057d);
            return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$u0 */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$sendTurnEndViewed$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {341}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147398w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f147400y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f147401z;

        /* JADX INFO: renamed from: ug0.b$u0$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$sendTurnEndViewed$1$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {344}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f147402w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34933b f147403x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f147404y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f147405z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C34933b c34933b, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f147403x = c34933b;
                this.f147404y = str;
                this.f147405z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f147403x, this.f147404y, this.f147405z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f147402w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lInteract = this.f147403x.markTurnEndViewedInteractor.interact(new C0456u(new C35997k0(this.f147404y, this.f147405z), 1));
                    this.f147402w = 1;
                    if (AbstractC13091v.m36603m(interfaceC13058lInteract, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(String str, String str2, InterfaceC30057d<? super u0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147400y = str;
            this.f147401z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34933b.this.new u0(this.f147400y, this.f147401z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147398w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C3075y1 c3075y1 = C3075y1.f12109w;
                a aVar = new a(C34933b.this, this.f147400y, this.f147401z, null);
                this.f147398w = 1;
                if (AbstractC3006f0.m8705K(c3075y1, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$v */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        public static final v<T> f147406w = new v<>();

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<C38271c> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$w */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$handleLastViewedTurn$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {362}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f147407w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33776a.g f147409y;

        /* JADX INFO: renamed from: ug0.b$w$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner$handleLastViewedTurn$1$1", m100430f = "AiChatConversationCombiner.kt", m100431l = {365}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f147410w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34933b f147411x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC33776a.g f147412y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C34933b c34933b, AbstractC33776a.g gVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f147411x = c34933b;
                this.f147412y = gVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f147411x, this.f147412y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f147410w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l interfaceC13058lInteract = this.f147411x.markLastViewedTurnInteractor.interact(new C0456u(new C35983d0(this.f147412y.getFingerprint(), this.f147412y.getTurnId()), 1));
                    this.f147410w = 1;
                    if (AbstractC13091v.m36603m(interfaceC13058lInteract, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(AbstractC33776a.g gVar, InterfaceC30057d<? super w> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f147409y = gVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34933b.this.new w(this.f147409y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f147407w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C3075y1 c3075y1 = C3075y1.f12109w;
                a aVar = new a(C34933b.this, this.f147409y, null);
                this.f147407w = 1;
                if (AbstractC3006f0.m8705K(c3075y1, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$x */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {396, 405}, m100432m = "handleRefreshConversationMetadata", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f147413E;

        /* JADX INFO: renamed from: F */
        Object f147414F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f147415G;

        /* JADX INFO: renamed from: I */
        int f147417I;

        /* JADX INFO: renamed from: w */
        Object f147418w;

        /* JADX INFO: renamed from: x */
        Object f147419x;

        /* JADX INFO: renamed from: y */
        Object f147420y;

        /* JADX INFO: renamed from: z */
        Object f147421z;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147415G = obj;
            this.f147417I |= Integer.MIN_VALUE;
            return C34933b.this.m110192Y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ug0.b$y */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C22669g0 f147422w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33777b f147423x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AIConversation f147424y;

        public y(C22669g0 c22669g0, C33777b c33777b, AIConversation aIConversation) {
            this.f147422w = c22669g0;
            this.f147423x = c33777b;
            this.f147424y = aIConversation;
        }

        @Override // ec3.InterfaceC13062m
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC36020w abstractC36020w, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C33777b c33777bM106825a;
            C22669g0 c22669g0 = this.f147422w;
            if (AbstractC22676k.m65745e(abstractC36020w, AbstractC36020w.b.f153596a)) {
                C33777b c33777b = this.f147423x;
                c33777bM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : true, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            } else if (abstractC36020w instanceof AbstractC36020w.c) {
                C33777b c33777b2 = this.f147423x;
                AIConversation aIConversation = this.f147424y;
                c33777bM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : AIConversation.copy$default(aIConversation, AIConversationMetadata.copy$default(aIConversation.getMetadata(), null, null, null, null, null, null, null, ((AbstractC36020w.c) abstractC36020w).getMetadata().getScrollToTurnId(), 127, null), null, null, null, null, 30, null), (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : null, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            } else {
                if (!(abstractC36020w instanceof AbstractC36020w.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C33777b c33777b3 = this.f147423x;
                c33777bM106825a = c33777b3.m106825a((65279 & 1) != 0 ? c33777b3.conversation : null, (65279 & 2) != 0 ? c33777b3.messagingState : null, (65279 & 4) != 0 ? c33777b3.loadingState : null, (65279 & 8) != 0 ? c33777b3.error : null, (65279 & 16) != 0 ? c33777b3.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b3.toastStyle : null, (65279 & 64) != 0 ? c33777b3.retryState : null, (65279 & 128) != 0 ? c33777b3.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b3.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b3.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b3.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b3.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b3.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b3.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b3.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b3.pendingFirstContentSeenTurnId : null);
            }
            c22669g0.f89336w = c33777bM106825a;
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ug0.b$z */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.combiner.AiChatConversationCombiner", m100430f = "AiChatConversationCombiner.kt", m100431l = {567, 578, 624}, m100432m = "handleStartNewConversation", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f147425E;

        /* JADX INFO: renamed from: G */
        int f147427G;

        /* JADX INFO: renamed from: w */
        Object f147428w;

        /* JADX INFO: renamed from: x */
        Object f147429x;

        /* JADX INFO: renamed from: y */
        Object f147430y;

        /* JADX INFO: renamed from: z */
        int f147431z;

        public z(InterfaceC30057d<? super z> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f147425E = obj;
            this.f147427G |= Integer.MIN_VALUE;
            return C34933b.this.m110193Z(null, this);
        }
    }

    public C34933b(C36000m createConversationInteractor, C36009q0 startNewConversationInteractor, C36024y getConversationTurnInteractor, C36018v getConversationMetadataInteractor, C36012s createTurnInteractor, C35990h aiChatImageInteractor, C35977b aiChatFileInteractor, C36021w0 stopTurnInteractor, C36015t0 stopAllTurnsInteractor, C36027z0 submitTurnFeedbackInteractor, C36006p createMxmSupportTicketInteractor, C35979b1 turnPollingInteractor, C37256f turnInterpolationInteractor, C35975a0 getSuggestionsInteractor, C35994j commitRecommendationInteractor, C31381b analyticsHelper, C35993i0 markTurnAsSeenOrchestrator, C35999l0 markTurnEndViewedInteractor, C35985e0 markLastViewedTurnInteractor, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(createConversationInteractor, "createConversationInteractor");
        AbstractC22676k.m65750j(startNewConversationInteractor, "startNewConversationInteractor");
        AbstractC22676k.m65750j(getConversationTurnInteractor, "getConversationTurnInteractor");
        AbstractC22676k.m65750j(getConversationMetadataInteractor, "getConversationMetadataInteractor");
        AbstractC22676k.m65750j(createTurnInteractor, "createTurnInteractor");
        AbstractC22676k.m65750j(aiChatImageInteractor, "aiChatImageInteractor");
        AbstractC22676k.m65750j(aiChatFileInteractor, "aiChatFileInteractor");
        AbstractC22676k.m65750j(stopTurnInteractor, "stopTurnInteractor");
        AbstractC22676k.m65750j(stopAllTurnsInteractor, "stopAllTurnsInteractor");
        AbstractC22676k.m65750j(submitTurnFeedbackInteractor, "submitTurnFeedbackInteractor");
        AbstractC22676k.m65750j(createMxmSupportTicketInteractor, "createMxmSupportTicketInteractor");
        AbstractC22676k.m65750j(turnPollingInteractor, "turnPollingInteractor");
        AbstractC22676k.m65750j(turnInterpolationInteractor, "turnInterpolationInteractor");
        AbstractC22676k.m65750j(getSuggestionsInteractor, "getSuggestionsInteractor");
        AbstractC22676k.m65750j(commitRecommendationInteractor, "commitRecommendationInteractor");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(markTurnAsSeenOrchestrator, "markTurnAsSeenOrchestrator");
        AbstractC22676k.m65750j(markTurnEndViewedInteractor, "markTurnEndViewedInteractor");
        AbstractC22676k.m65750j(markLastViewedTurnInteractor, "markLastViewedTurnInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.createConversationInteractor = createConversationInteractor;
        this.startNewConversationInteractor = startNewConversationInteractor;
        this.getConversationTurnInteractor = getConversationTurnInteractor;
        this.getConversationMetadataInteractor = getConversationMetadataInteractor;
        this.createTurnInteractor = createTurnInteractor;
        this.aiChatImageInteractor = aiChatImageInteractor;
        this.aiChatFileInteractor = aiChatFileInteractor;
        this.stopTurnInteractor = stopTurnInteractor;
        this.stopAllTurnsInteractor = stopAllTurnsInteractor;
        this.submitTurnFeedbackInteractor = submitTurnFeedbackInteractor;
        this.createMxmSupportTicketInteractor = createMxmSupportTicketInteractor;
        this.turnPollingInteractor = turnPollingInteractor;
        this.turnInterpolationInteractor = turnInterpolationInteractor;
        this.getSuggestionsInteractor = getSuggestionsInteractor;
        this.commitRecommendationInteractor = commitRecommendationInteractor;
        this.analyticsHelper = analyticsHelper;
        this.markTurnAsSeenOrchestrator = markTurnAsSeenOrchestrator;
        this.markTurnEndViewedInteractor = markTurnEndViewedInteractor;
        this.markLastViewedTurnInteractor = markLastViewedTurnInteractor;
        this.featureFlagChecker = featureFlagChecker;
        this.turnEndSeenTracker = new C34936e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public final AIConversation m110176I(AIConversation conversation, AITurn turn) {
        ArrayList arrayListM74128f1;
        Iterator<AITurn> it = conversation.getTurns().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), turn.getId())) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            arrayListM74128f1 = AbstractC25265s.m74128f1(turn, conversation.getTurns());
        } else {
            ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(conversation.getTurns());
            arrayListM74097F1.set(i13, turn);
            arrayListM74128f1 = arrayListM74097F1;
        }
        return AIConversation.copy$default(conversation, null, arrayListM74128f1, null, null, null, 29, null);
    }

    /* JADX INFO: renamed from: J */
    private final C33777b m110177J(C33777b accumulator, AbstractC33776a.q action) {
        AIConversation conversation = accumulator.getConversation();
        if (conversation != null && AbstractC22676k.m65745e(conversation.getMetadata().getFingerprint(), action.getFingerprint())) {
            AITurn aITurn = (AITurn) AbstractC25265s.m74114R0(conversation.getTurns());
            if (AbstractC22676k.m65745e(aITurn != null ? aITurn.getId() : null, action.getTurnId())) {
                return accumulator.m106825a((65279 & 1) != 0 ? accumulator.conversation : AIConversation.copy$default(conversation, null, null, null, null, action.m106814b(), 15, null), (65279 & 2) != 0 ? accumulator.messagingState : null, (65279 & 4) != 0 ? accumulator.loadingState : null, (65279 & 8) != 0 ? accumulator.error : null, (65279 & 16) != 0 ? accumulator.attachmentUploadModels : null, (65279 & 32) != 0 ? accumulator.toastStyle : null, (65279 & 64) != 0 ? accumulator.retryState : null, (65279 & 128) != 0 ? accumulator.isInterpolationComplete : false, (65279 & 256) != 0 ? accumulator.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? accumulator.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? accumulator.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? accumulator.openedFromHistory : false, (65279 & 4096) != 0 ? accumulator.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? accumulator.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? accumulator.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? accumulator.pendingFirstContentSeenTurnId : null);
            }
        }
        return accumulator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final InterfaceC13058l m110178K(AbstractC33776a conversationAction, InterfaceC13058l otherActions, C33777b currentState) {
        return new C13084s1(new c(conversationAction, currentState, otherActions, null));
    }

    /* JADX INFO: renamed from: L */
    private final boolean m110179L(AIConversation conversation, String turnId) {
        Object next;
        Iterator<T> it = conversation.getTurns().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((AITurn) next).getId(), turnId));
        AITurn aITurn = (AITurn) next;
        if (aITurn == null || aITurn.getTurnStatus() != AiMessageStatus.COMPLETE) {
            return false;
        }
        List<AITurn> turns = conversation.getTurns();
        if ((turns instanceof Collection) && turns.isEmpty()) {
            return true;
        }
        Iterator<T> it3 = turns.iterator();
        while (it3.hasNext()) {
            if (((AITurn) it3.next()).getTurnStatus() == AiMessageStatus.ACTIVE) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final boolean m110180M(AbstractC33776a abstractC33776a) {
        return (abstractC33776a instanceof AbstractC33776a.d) || (abstractC33776a instanceof AbstractC33776a.b) || (abstractC33776a instanceof AbstractC33776a.n) || AbstractC22676k.m65745e(abstractC33776a, AbstractC33776a.o.f141406a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fb, code lost:
    
        if (r5.emit(r0, r2) == r4) goto L27;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110181N(ec3.InterfaceC13062m r30, tg0.C33777b r31, tg0.AbstractC33780e r32, q83.InterfaceC30057d<? super l83.C23454a0> r33) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110181N(ec3.m, tg0.b, tg0.e, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fb, code lost:
    
        if (r5.emit(r0, r2) == r4) goto L27;
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110182O(ec3.InterfaceC13062m r30, tg0.C33777b r31, c91.AbstractC4328b r32, q83.InterfaceC30057d<? super l83.C23454a0> r33) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110182O(ec3.m, tg0.b, c91.b, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: P */
    public final Object m110183P(C33777b c33777b, String str, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        f fVar;
        AIConversation aIConversation;
        C33777b c33777b2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f147148G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f147148G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f147146E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f147148G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AIConversation conversation = c33777b.getConversation();
            if (conversation == null) {
                return c33777b;
            }
            boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled("backend-driven-suggested-question-visibility");
            C25271y c25271y = C25271y.f99162w;
            if (zIsFeatureEnabled) {
                AITurn aITurn = (AITurn) AbstractC25265s.m74114R0(conversation.getTurns());
                if (aITurn != null ? AbstractC22676k.m65745e(aITurn.getShouldShowSuggestedChips(), Boolean.FALSE) : false) {
                    return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : AIConversation.copy$default(conversation, null, null, null, null, c25271y, 15, null), (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
                }
            }
            AITurn aITurn2 = (AITurn) AbstractC25265s.m74114R0(conversation.getTurns());
            String id4 = aITurn2 != null ? aITurn2.getId() : null;
            if (this.featureFlagChecker.isFeatureEnabled("android-coach-early-message-emit") && id4 != null) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : AIConversation.copy$default(conversation, null, null, null, null, c25271y, 15, null), (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : id4, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            C35975a0 c35975a0 = this.getSuggestionsInteractor;
            fVar2.f147149w = c33777b;
            fVar2.f147150x = null;
            fVar2.f147151y = conversation;
            fVar2.f147152z = null;
            fVar2.f147148G = 1;
            Object objM114219e = C35975a0.m114219e(c35975a0, str, null, fVar2, 2, null);
            if (objM114219e == enumC31071a) {
                return enumC31071a;
            }
            aIConversation = conversation;
            obj = objM114219e;
            c33777b2 = c33777b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AIConversation aIConversation2 = (AIConversation) fVar2.f147151y;
            C33777b c33777b3 = (C33777b) fVar2.f147149w;
            AbstractC34132o.m107864I(obj);
            aIConversation = aIConversation2;
            c33777b2 = c33777b3;
        }
        return c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : AIConversation.copy$default(aIConversation, null, null, null, null, (List) obj, 15, null), (65279 & 2) != 0 ? c33777b2.messagingState : null, (65279 & 4) != 0 ? c33777b2.loadingState : null, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: Q */
    public final Object m110184Q(InterfaceC13062m interfaceC13062m, C33777b c33777b, AbstractC33776a.a aVar, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        g gVar;
        C22669g0 c22669g0;
        AIConversationMetadata metadata;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f147169K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f147169K = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f147167I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f147169K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AIConversation conversation = c33777b.getConversation();
            String fingerprint = (conversation == null || (metadata = conversation.getMetadata()) == null) ? null : metadata.getFingerprint();
            if (fingerprint == null || AbstractC39414r.m125890i0(fingerprint)) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : "Conversation fingerprint is missing", (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            C35992i c35992i = new C35992i(fingerprint, aVar.getRecommendationId(), aVar.getCommitted(), aVar.getReplacementId());
            C22669g0 c22669g1 = new C22669g0();
            c22669g1.f89336w = c33777b;
            String fingerprint2 = conversation.getMetadata().getFingerprint();
            InterfaceC13058l interfaceC13058lInteract = this.commitRecommendationInteractor.interact(new C0456u(c35992i, 1));
            c22669g0 = c22669g1;
            h hVar = new h(c22669g0, aVar, this, fingerprint2, c33777b, conversation, interfaceC13062m);
            gVar2.f147170w = null;
            gVar2.f147171x = null;
            gVar2.f147172y = null;
            gVar2.f147173z = null;
            gVar2.f147163E = null;
            gVar2.f147164F = null;
            gVar2.f147165G = c22669g0;
            gVar2.f147166H = null;
            gVar2.f147169K = 1;
            if (interfaceC13058lInteract.collect(hVar, gVar2) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) gVar2.f147165G;
            AbstractC34132o.m107864I(obj);
        }
        return c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x02d7 A[PHI: r1 r13 r14
      0x02d7: PHI (r1v24 ec3.m) = (r1v5 ec3.m), (r1v5 ec3.m), (r1v5 ec3.m), (r1v25 ec3.m) binds: [B:28:0x0190, B:30:0x0196, B:32:0x019c, B:101:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r13v11 kotlin.jvm.internal.g0) = 
      (r13v5 kotlin.jvm.internal.g0)
      (r13v5 kotlin.jvm.internal.g0)
      (r13v5 kotlin.jvm.internal.g0)
      (r13v12 kotlin.jvm.internal.g0)
     binds: [B:28:0x0190, B:30:0x0196, B:32:0x019c, B:101:0x02d5] A[DONT_GENERATE, DONT_INLINE]
      0x02d7: PHI (r14v13 tg0.a$b) = (r14v5 tg0.a$b), (r14v5 tg0.a$b), (r14v5 tg0.a$b), (r14v14 tg0.a$b) binds: [B:28:0x0190, B:30:0x0196, B:32:0x019c, B:101:0x02d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0305  */
    /* JADX WARN: Code duplicated, block: B:119:0x0314  */
    /* JADX WARN: Code duplicated, block: B:128:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[LOOP:0: B:113:0x02ff->B:129:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0186  */
    /* JADX WARN: Code duplicated, block: B:29:0x0192  */
    /* JADX WARN: Code duplicated, block: B:84:0x0258  */
    /* JADX WARN: Code duplicated, block: B:88:0x0263  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a7  */
    /* JADX INFO: renamed from: R */
    public final Object m110185R(InterfaceC13062m interfaceC13062m, AbstractC33776a.b bVar, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        i iVar;
        AbstractC33776a.b bVar2;
        C22669g0 c22669g0;
        InterfaceC13058l interfaceC13058lInteract;
        j jVar;
        AbstractC33776a.b bVar3;
        C22669g0 c22669g1;
        AIConversation conversation;
        AIConversationMetadata metadata;
        String fingerprint;
        C33777b c33777b;
        InterfaceC13062m interfaceC13062m2;
        C22669g0 c22669g2;
        AbstractC33776a.b bVar4;
        AITurn aITurn;
        int i13;
        int i14;
        InterfaceC13062m interfaceC13062m3;
        String str;
        AITurn aITurn2;
        int i15;
        int i16;
        int i17;
        int i18;
        List<AITurn> turns;
        List<AITurn> turns2;
        AITurn aITurn3;
        String str2;
        String id4;
        AbstractC33776a.d initialUserTurn;
        AIConversation conversation2;
        List<AITurn> turns3;
        List<AITurn> list;
        Iterator<T> it;
        InterfaceC13062m interfaceC13062m4 = interfaceC13062m;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i19 = iVar.f147209L;
            if ((i19 & Integer.MIN_VALUE) != 0) {
                iVar.f147209L = i19 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        i iVar2 = iVar;
        Object objM110211j0 = iVar2.f147207J;
        Object obj = EnumC31071a.f128113w;
        int i24 = 0;
        switch (iVar2.f147209L) {
            case 0:
                AbstractC34132o.m107864I(objM110211j0);
                Object c33777b2 = new C33777b(null, EnumC14565j.SUCCESS, EnumC26811m.SCREEN_LOADING, null, null, null, null, false, false, null, null, false, false, bVar.getIsDay0(), null, null, 57264, null);
                iVar2.f147210w = interfaceC13062m4;
                bVar2 = bVar;
                iVar2.f147211x = bVar2;
                iVar2.f147209L = 1;
                if (interfaceC13062m4.emit(c33777b2, iVar2) != obj) {
                    C35998l c35998l = new C35998l(bVar2.getFingerprint(), bVar2.getSource(), bVar2.getSourceId(), bVar2.getInitialMessage(), bVar2.getPresetQuestionKey(), bVar2.m106785a(), bVar2.getIsWcePrefetch(), bVar2.getEntrypointExperience());
                    c22669g0 = new C22669g0();
                    c22669g0.f89336w = new C33777b(null, null, null, null, null, null, null, false, false, null, null, false, false, false, null, null, 65535, null);
                    interfaceC13058lInteract = this.createConversationInteractor.interact(new C0456u(c35998l, 1));
                    jVar = new j(c22669g0, bVar2, this);
                    iVar2.f147210w = interfaceC13062m4;
                    iVar2.f147211x = bVar2;
                    iVar2.f147212y = null;
                    iVar2.f147213z = c22669g0;
                    iVar2.f147209L = 2;
                    if (interfaceC13058lInteract.collect(jVar, iVar2) != obj) {
                        bVar3 = bVar2;
                        c22669g1 = c22669g0;
                        conversation = ((C33777b) c22669g1.f89336w).getConversation();
                        if (conversation == null && (metadata = conversation.getMetadata()) != null && (fingerprint = metadata.getFingerprint()) != null) {
                            AIConversation conversation3 = ((C33777b) c22669g1.f89336w).getConversation();
                            AiMessageStatus turnStatus = (conversation3 == null || (turns2 = conversation3.getTurns()) == null || (aITurn3 = (AITurn) AbstractC25265s.m74114R0(turns2)) == null) ? null : aITurn3.getTurnStatus();
                            int i25 = turnStatus == null ? -1 : b.f147078a[turnStatus.ordinal()];
                            if (i25 != -1) {
                                if (i25 == 1) {
                                    C33777b c33777b3 = (C33777b) c22669g1.f89336w;
                                    iVar2.f147210w = interfaceC13062m4;
                                    iVar2.f147211x = bVar3;
                                    iVar2.f147212y = null;
                                    iVar2.f147213z = c22669g1;
                                    iVar2.f147202E = null;
                                    iVar2.f147204G = 0;
                                    iVar2.f147209L = 3;
                                    objM110211j0 = m110211j0(this, interfaceC13062m4, c33777b3, fingerprint, null, iVar2, 4, null);
                                    if (objM110211j0 != obj) {
                                        interfaceC13062m2 = interfaceC13062m4;
                                        c22669g2 = c22669g1;
                                        bVar4 = bVar3;
                                        c33777b = (C33777b) objM110211j0;
                                        c22669g1 = c22669g2;
                                        bVar3 = bVar4;
                                        interfaceC13062m4 = interfaceC13062m2;
                                        if (c33777b == null) {
                                            c33777b = (C33777b) c22669g1.f89336w;
                                        }
                                        initialUserTurn = bVar3.getInitialUserTurn();
                                        conversation2 = c33777b.getConversation();
                                        if (conversation2 != null) {
                                            list = turns3;
                                            if (list instanceof Collection) {
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                        i24 = 1;
                                                    }
                                                }
                                            } else {
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                    if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                        i24 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        if (initialUserTurn != null) {
                                        }
                                        return c33777b;
                                    }
                                } else if (i25 == 2) {
                                    AIConversation conversation4 = ((C33777b) c22669g1.f89336w).getConversation();
                                    aITurn = (conversation4 == null || (turns = conversation4.getTurns()) == null) ? null : (AITurn) AbstractC25265s.m74114R0(turns);
                                    i13 = (aITurn == null || !AbstractC38270b.m122612b(aITurn)) ? 0 : 1;
                                    i14 = (i13 != 0 && bVar3.getInitialUserTurn() == null && this.featureFlagChecker.isFeatureEnabled("android-coach-early-message-emit")) ? 1 : 0;
                                    if (i13 == 0 || i14 != 0) {
                                        interfaceC13062m3 = interfaceC13062m4;
                                        str = fingerprint;
                                        aITurn2 = aITurn;
                                        i15 = 0;
                                        c22669g2 = c22669g1;
                                        bVar4 = bVar3;
                                        C33777b c33777b4 = (C33777b) c22669g2.f89336w;
                                        if (aITurn2 != null || (id4 = aITurn2.getId()) == null || i14 == 0) {
                                            str2 = null;
                                        } else {
                                            str2 = id4;
                                        }
                                        C33777b c33777bM106825a = c33777b4.m106825a((65279 & 1) != 0 ? c33777b4.conversation : null, (65279 & 2) != 0 ? c33777b4.messagingState : null, (65279 & 4) != 0 ? c33777b4.loadingState : null, (65279 & 8) != 0 ? c33777b4.error : null, (65279 & 16) != 0 ? c33777b4.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b4.toastStyle : null, (65279 & 64) != 0 ? c33777b4.retryState : null, (65279 & 128) != 0 ? c33777b4.isInterpolationComplete : true, (65279 & 256) != 0 ? c33777b4.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b4.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b4.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b4.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b4.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b4.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b4.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b4.pendingFirstContentSeenTurnId : str2);
                                        iVar2.f147210w = interfaceC13062m3;
                                        iVar2.f147211x = bVar4;
                                        iVar2.f147212y = null;
                                        iVar2.f147213z = c22669g2;
                                        iVar2.f147202E = null;
                                        iVar2.f147203F = null;
                                        iVar2.f147204G = i15;
                                        iVar2.f147205H = i13;
                                        iVar2.f147206I = i14;
                                        iVar2.f147209L = 5;
                                        objM110211j0 = m110183P(c33777bM106825a, str, iVar2);
                                        if (objM110211j0 != obj) {
                                            interfaceC13062m2 = interfaceC13062m3;
                                            c33777b = (C33777b) objM110211j0;
                                            c22669g1 = c22669g2;
                                            bVar3 = bVar4;
                                            interfaceC13062m4 = interfaceC13062m2;
                                            if (c33777b == null) {
                                                c33777b = (C33777b) c22669g1.f89336w;
                                            }
                                            initialUserTurn = bVar3.getInitialUserTurn();
                                            conversation2 = c33777b.getConversation();
                                            if (conversation2 != null) {
                                                list = turns3;
                                                if (list instanceof Collection) {
                                                    it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                            i24 = 1;
                                                        }
                                                    }
                                                } else {
                                                    it = list.iterator();
                                                    while (it.hasNext()) {
                                                        if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                            i24 = 1;
                                                        }
                                                    }
                                                }
                                            }
                                            if (initialUserTurn != null) {
                                            }
                                            return c33777b;
                                        }
                                    } else {
                                        C35993i0 c35993i0 = this.markTurnAsSeenOrchestrator;
                                        String id5 = aITurn.getId();
                                        iVar2.f147210w = interfaceC13062m4;
                                        iVar2.f147211x = bVar3;
                                        iVar2.f147212y = null;
                                        iVar2.f147213z = c22669g1;
                                        iVar2.f147202E = fingerprint;
                                        iVar2.f147203F = aITurn;
                                        iVar2.f147204G = 0;
                                        iVar2.f147205H = i13;
                                        iVar2.f147206I = i14;
                                        iVar2.f147209L = 4;
                                        if (c35993i0.m114313d(fingerprint, id5, iVar2) != obj) {
                                            interfaceC13062m3 = interfaceC13062m4;
                                            str = fingerprint;
                                            i16 = i14;
                                            i17 = 0;
                                            i18 = i13;
                                            i13 = i18;
                                            aITurn2 = aITurn;
                                            i15 = i17;
                                            i14 = i16;
                                            bVar4 = bVar3;
                                            c22669g2 = c22669g1;
                                            C33777b c33777b5 = (C33777b) c22669g2.f89336w;
                                            if (aITurn2 != null) {
                                                str2 = null;
                                            } else {
                                                str2 = null;
                                            }
                                            C33777b c33777bM106825a2 = c33777b5.m106825a((65279 & 1) != 0 ? c33777b5.conversation : null, (65279 & 2) != 0 ? c33777b5.messagingState : null, (65279 & 4) != 0 ? c33777b5.loadingState : null, (65279 & 8) != 0 ? c33777b5.error : null, (65279 & 16) != 0 ? c33777b5.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b5.toastStyle : null, (65279 & 64) != 0 ? c33777b5.retryState : null, (65279 & 128) != 0 ? c33777b5.isInterpolationComplete : true, (65279 & 256) != 0 ? c33777b5.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b5.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b5.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b5.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b5.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b5.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b5.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b5.pendingFirstContentSeenTurnId : str2);
                                            iVar2.f147210w = interfaceC13062m3;
                                            iVar2.f147211x = bVar4;
                                            iVar2.f147212y = null;
                                            iVar2.f147213z = c22669g2;
                                            iVar2.f147202E = null;
                                            iVar2.f147203F = null;
                                            iVar2.f147204G = i15;
                                            iVar2.f147205H = i13;
                                            iVar2.f147206I = i14;
                                            iVar2.f147209L = 5;
                                            objM110211j0 = m110183P(c33777bM106825a2, str, iVar2);
                                            if (objM110211j0 != obj) {
                                                interfaceC13062m2 = interfaceC13062m3;
                                                c33777b = (C33777b) objM110211j0;
                                                c22669g1 = c22669g2;
                                                bVar3 = bVar4;
                                                interfaceC13062m4 = interfaceC13062m2;
                                                if (c33777b == null) {
                                                    c33777b = (C33777b) c22669g1.f89336w;
                                                }
                                                initialUserTurn = bVar3.getInitialUserTurn();
                                                conversation2 = c33777b.getConversation();
                                                if (conversation2 != null) {
                                                    list = turns3;
                                                    if (list instanceof Collection) {
                                                        it = list.iterator();
                                                        while (it.hasNext()) {
                                                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                                i24 = 1;
                                                            }
                                                        }
                                                    } else {
                                                        it = list.iterator();
                                                        while (it.hasNext()) {
                                                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                                                i24 = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (initialUserTurn != null) {
                                                }
                                                return c33777b;
                                            }
                                        }
                                    }
                                } else if (i25 != 3 && i25 != 4 && i25 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            c33777b = (C33777b) c22669g1.f89336w;
                            if (c33777b == null) {
                                c33777b = (C33777b) c22669g1.f89336w;
                            }
                            initialUserTurn = bVar3.getInitialUserTurn();
                            conversation2 = c33777b.getConversation();
                            if (conversation2 != null) {
                                list = turns3;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                            i24 = 1;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                            i24 = 1;
                                        }
                                    }
                                }
                            }
                            if (initialUserTurn != null) {
                            }
                            return c33777b;
                        }
                        c33777b = (C33777b) c22669g1.f89336w;
                        initialUserTurn = bVar3.getInitialUserTurn();
                        conversation2 = c33777b.getConversation();
                        if (conversation2 != null && (turns3 = conversation2.getTurns()) != null) {
                            list = turns3;
                            if ((list instanceof Collection) || !list.isEmpty()) {
                                it = list.iterator();
                                while (it.hasNext()) {
                                    if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                        i24 = 1;
                                    }
                                }
                            }
                        }
                        if (initialUserTurn != null || c33777b.getConversation() == null || i24 != 0) {
                            return c33777b;
                        }
                        C33777b c33777bM110229s0 = m110229s0(c33777b);
                        iVar2.f147210w = null;
                        iVar2.f147211x = null;
                        iVar2.f147212y = null;
                        iVar2.f147213z = null;
                        iVar2.f147202E = null;
                        iVar2.f147203F = null;
                        iVar2.f147204G = i24;
                        iVar2.f147209L = 6;
                        Object objM110187T = m110187T(interfaceC13062m4, c33777bM110229s0, initialUserTurn, iVar2);
                        if (objM110187T != obj) {
                            return objM110187T;
                        }
                    }
                }
                return obj;
            case 1:
                AbstractC33776a.b bVar5 = (AbstractC33776a.b) iVar2.f147211x;
                InterfaceC13062m interfaceC13062m5 = (InterfaceC13062m) iVar2.f147210w;
                AbstractC34132o.m107864I(objM110211j0);
                bVar2 = bVar5;
                interfaceC13062m4 = interfaceC13062m5;
                C35998l c35998l2 = new C35998l(bVar2.getFingerprint(), bVar2.getSource(), bVar2.getSourceId(), bVar2.getInitialMessage(), bVar2.getPresetQuestionKey(), bVar2.m106785a(), bVar2.getIsWcePrefetch(), bVar2.getEntrypointExperience());
                c22669g0 = new C22669g0();
                c22669g0.f89336w = new C33777b(null, null, null, null, null, null, null, false, false, null, null, false, false, false, null, null, 65535, null);
                interfaceC13058lInteract = this.createConversationInteractor.interact(new C0456u(c35998l2, 1));
                jVar = new j(c22669g0, bVar2, this);
                iVar2.f147210w = interfaceC13062m4;
                iVar2.f147211x = bVar2;
                iVar2.f147212y = null;
                iVar2.f147213z = c22669g0;
                iVar2.f147209L = 2;
                if (interfaceC13058lInteract.collect(jVar, iVar2) != obj) {
                    bVar3 = bVar2;
                    c22669g1 = c22669g0;
                    conversation = ((C33777b) c22669g1.f89336w).getConversation();
                    if (conversation == null) {
                        break;
                    }
                    c33777b = (C33777b) c22669g1.f89336w;
                    initialUserTurn = bVar3.getInitialUserTurn();
                    conversation2 = c33777b.getConversation();
                    if (conversation2 != null) {
                        list = turns3;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                    i24 = 1;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                    i24 = 1;
                                }
                            }
                        }
                    }
                    if (initialUserTurn != null) {
                        break;
                    }
                    return c33777b;
                }
                return obj;
            case 2:
                C22669g0 c22669g3 = (C22669g0) iVar2.f147213z;
                AbstractC33776a.b bVar6 = (AbstractC33776a.b) iVar2.f147211x;
                InterfaceC13062m interfaceC13062m6 = (InterfaceC13062m) iVar2.f147210w;
                AbstractC34132o.m107864I(objM110211j0);
                c22669g1 = c22669g3;
                bVar3 = bVar6;
                interfaceC13062m4 = interfaceC13062m6;
                conversation = ((C33777b) c22669g1.f89336w).getConversation();
                if (conversation == null) {
                    break;
                }
                c33777b = (C33777b) c22669g1.f89336w;
                initialUserTurn = bVar3.getInitialUserTurn();
                conversation2 = c33777b.getConversation();
                if (conversation2 != null) {
                    list = turns3;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    }
                }
                if (initialUserTurn != null) {
                    break;
                }
                return c33777b;
            case 3:
                c22669g2 = (C22669g0) iVar2.f147213z;
                bVar4 = (AbstractC33776a.b) iVar2.f147211x;
                interfaceC13062m2 = (InterfaceC13062m) iVar2.f147210w;
                AbstractC34132o.m107864I(objM110211j0);
                c33777b = (C33777b) objM110211j0;
                c22669g1 = c22669g2;
                bVar3 = bVar4;
                interfaceC13062m4 = interfaceC13062m2;
                if (c33777b == null) {
                    c33777b = (C33777b) c22669g1.f89336w;
                }
                initialUserTurn = bVar3.getInitialUserTurn();
                conversation2 = c33777b.getConversation();
                if (conversation2 != null) {
                    list = turns3;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    }
                }
                if (initialUserTurn != null) {
                    break;
                }
                return c33777b;
            case 4:
                i16 = iVar2.f147206I;
                i18 = iVar2.f147205H;
                i17 = iVar2.f147204G;
                aITurn = (AITurn) iVar2.f147203F;
                str = (String) iVar2.f147202E;
                c22669g1 = (C22669g0) iVar2.f147213z;
                bVar3 = (AbstractC33776a.b) iVar2.f147211x;
                interfaceC13062m3 = (InterfaceC13062m) iVar2.f147210w;
                AbstractC34132o.m107864I(objM110211j0);
                i13 = i18;
                aITurn2 = aITurn;
                i15 = i17;
                i14 = i16;
                bVar4 = bVar3;
                c22669g2 = c22669g1;
                C33777b c33777b6 = (C33777b) c22669g2.f89336w;
                if (aITurn2 != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                C33777b c33777bM106825a3 = c33777b6.m106825a((65279 & 1) != 0 ? c33777b6.conversation : null, (65279 & 2) != 0 ? c33777b6.messagingState : null, (65279 & 4) != 0 ? c33777b6.loadingState : null, (65279 & 8) != 0 ? c33777b6.error : null, (65279 & 16) != 0 ? c33777b6.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b6.toastStyle : null, (65279 & 64) != 0 ? c33777b6.retryState : null, (65279 & 128) != 0 ? c33777b6.isInterpolationComplete : true, (65279 & 256) != 0 ? c33777b6.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b6.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b6.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b6.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b6.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b6.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b6.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b6.pendingFirstContentSeenTurnId : str2);
                iVar2.f147210w = interfaceC13062m3;
                iVar2.f147211x = bVar4;
                iVar2.f147212y = null;
                iVar2.f147213z = c22669g2;
                iVar2.f147202E = null;
                iVar2.f147203F = null;
                iVar2.f147204G = i15;
                iVar2.f147205H = i13;
                iVar2.f147206I = i14;
                iVar2.f147209L = 5;
                objM110211j0 = m110183P(c33777bM106825a3, str, iVar2);
                if (objM110211j0 != obj) {
                    interfaceC13062m2 = interfaceC13062m3;
                    c33777b = (C33777b) objM110211j0;
                    c22669g1 = c22669g2;
                    bVar3 = bVar4;
                    interfaceC13062m4 = interfaceC13062m2;
                    if (c33777b == null) {
                        c33777b = (C33777b) c22669g1.f89336w;
                    }
                    initialUserTurn = bVar3.getInitialUserTurn();
                    conversation2 = c33777b.getConversation();
                    if (conversation2 != null) {
                        list = turns3;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                    i24 = 1;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                    i24 = 1;
                                }
                            }
                        }
                    }
                    if (initialUserTurn != null) {
                        break;
                    }
                    return c33777b;
                }
                return obj;
            case 5:
                c22669g2 = (C22669g0) iVar2.f147213z;
                bVar4 = (AbstractC33776a.b) iVar2.f147211x;
                interfaceC13062m2 = (InterfaceC13062m) iVar2.f147210w;
                AbstractC34132o.m107864I(objM110211j0);
                c33777b = (C33777b) objM110211j0;
                c22669g1 = c22669g2;
                bVar3 = bVar4;
                interfaceC13062m4 = interfaceC13062m2;
                if (c33777b == null) {
                    c33777b = (C33777b) c22669g1.f89336w;
                }
                initialUserTurn = bVar3.getInitialUserTurn();
                conversation2 = c33777b.getConversation();
                if (conversation2 != null) {
                    list = turns3;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (AbstractC38270b.m122611a((AITurn) it.next())) {
                                i24 = 1;
                            }
                        }
                    }
                }
                if (initialUserTurn != null) {
                    break;
                }
                return c33777b;
            case 6:
                AbstractC34132o.m107864I(objM110211j0);
                return objM110211j0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        if (r10.collect(r0, r6) == r7) goto L37;
     */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110186S(ec3.InterfaceC13062m r31, tg0.C33777b r32, tg0.AbstractC33776a.c r33, q83.InterfaceC30057d<? super tg0.C33777b> r34) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110186S(ec3.m, tg0.b, tg0.a$c, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:85:0x028e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b9  */
    /* JADX INFO: renamed from: T */
    public final Object m110187T(InterfaceC13062m interfaceC13062m, C33777b c33777b, AbstractC33776a.d dVar, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        m mVar;
        AIConversation conversation;
        String fingerprint;
        C33777b c33777b2;
        InterfaceC13062m interfaceC13062m2;
        List<C38271c> list;
        AbstractC33776a.d dVar2;
        List<String> listM106799b;
        AIConversationMetadata metadata;
        AbstractC33776a.d dVar3;
        InterfaceC13062m interfaceC13062m3;
        String str;
        C22669g0 c22669g0;
        C22669g0 c22669g1;
        Attachment attachment;
        C22669g0 c22669g2;
        C22669g0 c22669g3;
        AbstractC33776a.d dVar4;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f147270N;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f147270N = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        m mVar2 = mVar;
        Object objM110209i0 = mVar2.f147268L;
        Object obj = EnumC31071a.f128113w;
        int i14 = mVar2.f147270N;
        String str2 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110209i0);
            conversation = c33777b.getConversation();
            fingerprint = (conversation == null || (metadata = conversation.getMetadata()) == null) ? null : metadata.getFingerprint();
            if (fingerprint == null || AbstractC39414r.m125890i0(fingerprint)) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : EnumC14565j.ERROR, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b.error : "Conversation fingerprint is missing", (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            String content = dVar.getContent();
            if (content == null) {
                content = "";
            }
            if (AbstractC39414r.m125890i0(content) && ((listM106799b = dVar.m106799b()) == null || listM106799b.isEmpty())) {
                this.analyticsHelper.m96620a(new AbstractC31380a.h(content.length(), content.length() > 0, dVar.getIsSuggestion() ? "suggestion" : "input"));
                if (this.featureFlagChecker.isFeatureEnabled("android-aichat-prevent-empty-turn")) {
                    return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : c33777b.getMessagingState() == EnumC14565j.ERROR ? EnumC14565j.SUCCESS : c33777b.getMessagingState(), (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
                }
            }
            List<C38271c> listM106827d = c33777b.m106827d();
            c33777b2 = c33777b;
            Object objM106825a = c33777b2.m106825a((65279 & 1) != 0 ? c33777b2.conversation : null, (65279 & 2) != 0 ? c33777b2.messagingState : EnumC14565j.LOADING, (65279 & 4) != 0 ? c33777b2.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b2.error : null, (65279 & 16) != 0 ? c33777b2.attachmentUploadModels : C25271y.f99162w, (65279 & 32) != 0 ? c33777b2.toastStyle : null, (65279 & 64) != 0 ? c33777b2.retryState : null, (65279 & 128) != 0 ? c33777b2.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b2.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b2.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b2.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b2.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b2.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b2.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b2.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b2.pendingFirstContentSeenTurnId : null);
            mVar2.f147271w = interfaceC13062m;
            mVar2.f147272x = c33777b2;
            mVar2.f147273y = dVar;
            mVar2.f147274z = conversation;
            mVar2.f147261E = fingerprint;
            mVar2.f147262F = null;
            mVar2.f147263G = listM106827d;
            mVar2.f147270N = 1;
            if (interfaceC13062m.emit(objM106825a, mVar2) != obj) {
                interfaceC13062m2 = interfaceC13062m;
                list = listM106827d;
                dVar2 = dVar;
            }
            return obj;
        }
        if (i14 == 1) {
            list = (List) mVar2.f147263G;
            fingerprint = (String) mVar2.f147261E;
            AIConversation aIConversation = (AIConversation) mVar2.f147274z;
            AbstractC33776a.d dVar5 = (AbstractC33776a.d) mVar2.f147273y;
            C33777b c33777b3 = (C33777b) mVar2.f147272x;
            InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) mVar2.f147271w;
            AbstractC34132o.m107864I(objM110209i0);
            c33777b2 = c33777b3;
            interfaceC13062m2 = interfaceC13062m4;
            conversation = aIConversation;
            dVar2 = dVar5;
        } else {
            if (i14 == 2) {
                c22669g1 = (C22669g0) mVar2.f147266J;
                C22669g0 c22669g4 = (C22669g0) mVar2.f147265I;
                String str3 = (String) mVar2.f147261E;
                AbstractC33776a.d dVar6 = (AbstractC33776a.d) mVar2.f147273y;
                InterfaceC13062m interfaceC13062m5 = (InterfaceC13062m) mVar2.f147271w;
                AbstractC34132o.m107864I(objM110209i0);
                dVar3 = dVar6;
                interfaceC13062m3 = interfaceC13062m5;
                c22669g0 = c22669g4;
                str = str3;
                C33777b c33777b4 = (C33777b) c22669g0.f89336w;
                String str4 = (String) c22669g1.f89336w;
                mVar2.f147271w = null;
                mVar2.f147272x = null;
                mVar2.f147273y = dVar3;
                mVar2.f147274z = null;
                mVar2.f147261E = null;
                mVar2.f147262F = null;
                mVar2.f147263G = null;
                mVar2.f147264H = null;
                mVar2.f147265I = c22669g0;
                mVar2.f147266J = null;
                mVar2.f147267K = c22669g0;
                mVar2.f147270N = 3;
                objM110209i0 = m110209i0(interfaceC13062m3, c33777b4, str, str4, mVar2);
                if (objM110209i0 != obj) {
                    c22669g2 = c22669g0;
                    c22669g3 = c22669g2;
                    dVar4 = dVar3;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g2 = (C22669g0) mVar2.f147267K;
            c22669g3 = (C22669g0) mVar2.f147265I;
            dVar4 = (AbstractC33776a.d) mVar2.f147273y;
            AbstractC34132o.m107864I(objM110209i0);
        }
        c22669g2.f89336w = objM110209i0;
        if (((C33777b) c22669g3.f89336w).getMessagingState() == EnumC14565j.ERROR && ((C33777b) c22669g3.f89336w).getRetryState() == null) {
            C33777b c33777b5 = (C33777b) c22669g3.f89336w;
            String error = c33777b5.getError();
            c22669g3.f89336w = c33777b5.m106825a((65279 & 1) != 0 ? c33777b5.conversation : null, (65279 & 2) != 0 ? c33777b5.messagingState : null, (65279 & 4) != 0 ? c33777b5.loadingState : null, (65279 & 8) != 0 ? c33777b5.error : null, (65279 & 16) != 0 ? c33777b5.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b5.toastStyle : null, (65279 & 64) != 0 ? c33777b5.retryState : new C33783h(dVar4, new C14567l(UserState.Sources.USER, "text", error != null ? error : "")), (65279 & 128) != 0 ? c33777b5.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b5.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b5.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b5.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b5.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b5.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b5.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b5.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b5.pendingFirstContentSeenTurnId : null);
        }
        return c22669g3.f89336w;
        String str5 = fingerprint;
        String content2 = dVar2.getContent();
        List<String> listM106799b2 = dVar2.m106799b();
        ArrayList arrayList = new ArrayList();
        for (C38271c c38271c : list) {
            Uri uri = c38271c.getUri();
            if (uri != null) {
                String string = uri.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                AttachmentType type = c38271c.getType();
                String displayName = c38271c.getDisplayName();
                attachment = new Attachment(string, type, displayName.length() == 0 ? str2 : displayName, c38271c.getCreatedAtFormatted());
            } else {
                attachment = null;
            }
            if (attachment != null) {
                arrayList.add(attachment);
            }
            str2 = null;
        }
        C36010r c36010r = new C36010r(str5, content2, listM106799b2, arrayList.isEmpty() ? null : arrayList, new Long(dVar2.getUserTimestamp()), dVar2.getIsSuggestion());
        C22669g0 c22669g5 = new C22669g0();
        c22669g5.f89336w = c33777b2;
        C22669g0 c22669g6 = new C22669g0();
        InterfaceC13058l interfaceC13058lInteract = this.createTurnInteractor.interact(new C0456u(c36010r, 1));
        n nVar = new n(c22669g5, conversation, this, dVar2, c22669g6, interfaceC13062m2);
        mVar2.f147271w = interfaceC13062m2;
        mVar2.f147272x = null;
        mVar2.f147273y = dVar2;
        mVar2.f147274z = null;
        mVar2.f147261E = str5;
        mVar2.f147262F = null;
        mVar2.f147263G = null;
        mVar2.f147264H = null;
        mVar2.f147265I = c22669g5;
        mVar2.f147266J = c22669g6;
        mVar2.f147270N = 2;
        if (interfaceC13058lInteract.collect(nVar, mVar2) != obj) {
            dVar3 = dVar2;
            interfaceC13062m3 = interfaceC13062m2;
            str = str5;
            c22669g0 = c22669g5;
            c22669g1 = c22669g6;
            C33777b c33777b6 = (C33777b) c22669g0.f89336w;
            String str6 = (String) c22669g1.f89336w;
            mVar2.f147271w = null;
            mVar2.f147272x = null;
            mVar2.f147273y = dVar3;
            mVar2.f147274z = null;
            mVar2.f147261E = null;
            mVar2.f147262F = null;
            mVar2.f147263G = null;
            mVar2.f147264H = null;
            mVar2.f147265I = c22669g0;
            mVar2.f147266J = null;
            mVar2.f147267K = c22669g0;
            mVar2.f147270N = 3;
            objM110209i0 = m110209i0(interfaceC13062m3, c33777b6, str, str6, mVar2);
            if (objM110209i0 != obj) {
                c22669g2 = c22669g0;
                c22669g3 = c22669g2;
                dVar4 = dVar3;
                c22669g2.f89336w = objM110209i0;
                if (((C33777b) c22669g3.f89336w).getMessagingState() == EnumC14565j.ERROR) {
                    C33777b c33777b7 = (C33777b) c22669g3.f89336w;
                    String error2 = c33777b7.getError();
                    c22669g3.f89336w = c33777b7.m106825a((65279 & 1) != 0 ? c33777b7.conversation : null, (65279 & 2) != 0 ? c33777b7.messagingState : null, (65279 & 4) != 0 ? c33777b7.loadingState : null, (65279 & 8) != 0 ? c33777b7.error : null, (65279 & 16) != 0 ? c33777b7.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b7.toastStyle : null, (65279 & 64) != 0 ? c33777b7.retryState : new C33783h(dVar4, new C14567l(UserState.Sources.USER, "text", error2 != null ? error2 : "")), (65279 & 128) != 0 ? c33777b7.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b7.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b7.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b7.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b7.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b7.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b7.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b7.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b7.pendingFirstContentSeenTurnId : null);
                }
                return c22669g3.f89336w;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:107:0x0303  */
    /* JADX WARN: Code duplicated, block: B:109:0x0312  */
    /* JADX WARN: Code duplicated, block: B:115:0x036a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0395  */
    /* JADX WARN: Code duplicated, block: B:125:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x025a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0323 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x0211  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:82:0x023f  */
    /* JADX WARN: Code duplicated, block: B:84:0x024d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0264  */
    /* JADX WARN: Code duplicated, block: B:91:0x0268  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bb  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e4, code lost:
    
        if (r2.collect(r4, r5) == r6) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x038f, code lost:
    
        if (r2.collect(r3, r5) == r6) goto L118;
     */
    /* JADX INFO: renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110188U(ec3.InterfaceC13062m r38, tg0.C33777b r39, tg0.AbstractC33776a r40, q83.InterfaceC30057d<? super tg0.C33777b> r41) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110188U(ec3.m, tg0.b, tg0.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x019c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: V */
    public final Object m110189V(InterfaceC13062m interfaceC13062m, C33777b c33777b, AbstractC33776a.f fVar, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        r rVar;
        AIConversation conversation;
        AbstractC33776a.f fVar2;
        String str;
        C33777b c33777b2;
        InterfaceC13062m interfaceC13062m2;
        AIConversationMetadata metadata;
        C22669g0 c22669g0;
        AbstractC33776a.f fVar3;
        InterfaceC13062m interfaceC13062m3;
        String str2;
        C22669g0 c22669g1;
        C22669g0 c22669g2;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i13 = rVar.f147345K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f147345K = i13 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        r rVar2 = rVar;
        Object objM110209i0 = rVar2.f147343I;
        Object obj = EnumC31071a.f128113w;
        int i14 = rVar2.f147345K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110209i0);
            conversation = c33777b.getConversation();
            String fingerprint = (conversation == null || (metadata = conversation.getMetadata()) == null) ? null : metadata.getFingerprint();
            if (fingerprint == null || AbstractC39414r.m125890i0(fingerprint)) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.MESSAGE_ERROR, (65279 & 8) != 0 ? c33777b.error : "Conversation fingerprint is missing", (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            if (AbstractC39414r.m125890i0(fVar.getTurnId())) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.MESSAGE_ERROR, (65279 & 8) != 0 ? c33777b.error : "Turn ID is missing", (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            Object objM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.MESSAGE_LOADING, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            rVar2.f147346w = interfaceC13062m;
            rVar2.f147347x = c33777b;
            rVar2.f147348y = fVar;
            rVar2.f147349z = conversation;
            rVar2.f147339E = fingerprint;
            rVar2.f147345K = 1;
            if (interfaceC13062m.emit(objM106825a, rVar2) != obj) {
                fVar2 = fVar;
                str = fingerprint;
                c33777b2 = c33777b;
                interfaceC13062m2 = interfaceC13062m;
            }
            return obj;
        }
        if (i14 == 1) {
            String str3 = (String) rVar2.f147339E;
            conversation = (AIConversation) rVar2.f147349z;
            AbstractC33776a.f fVar4 = (AbstractC33776a.f) rVar2.f147348y;
            C33777b c33777b3 = (C33777b) rVar2.f147347x;
            interfaceC13062m2 = (InterfaceC13062m) rVar2.f147346w;
            AbstractC34132o.m107864I(objM110209i0);
            str = str3;
            c33777b2 = c33777b3;
            fVar2 = fVar4;
        } else {
            if (i14 == 2) {
                C22669g0 c22669g3 = (C22669g0) rVar2.f147341G;
                str2 = (String) rVar2.f147339E;
                fVar3 = (AbstractC33776a.f) rVar2.f147348y;
                InterfaceC13062m interfaceC13062m4 = (InterfaceC13062m) rVar2.f147346w;
                AbstractC34132o.m107864I(objM110209i0);
                c22669g0 = c22669g3;
                interfaceC13062m3 = interfaceC13062m4;
                C33777b c33777b4 = (C33777b) c22669g0.f89336w;
                String turnId = fVar3.getTurnId();
                rVar2.f147346w = null;
                rVar2.f147347x = null;
                rVar2.f147348y = null;
                rVar2.f147349z = null;
                rVar2.f147339E = null;
                rVar2.f147340F = null;
                rVar2.f147341G = c22669g0;
                rVar2.f147342H = c22669g0;
                rVar2.f147345K = 3;
                objM110209i0 = m110209i0(interfaceC13062m3, c33777b4, str2, turnId, rVar2);
                if (objM110209i0 != obj) {
                    c22669g1 = c22669g0;
                    c22669g2 = c22669g1;
                }
                return obj;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g1 = (C22669g0) rVar2.f147342H;
            c22669g2 = (C22669g0) rVar2.f147341G;
            AbstractC34132o.m107864I(objM110209i0);
        }
        c22669g1.f89336w = objM110209i0;
        return c22669g2.f89336w;
        AIConversation aIConversation = conversation;
        C36022x c36022x = new C36022x(str, fVar2.getTurnId());
        C22669g0 c22669g4 = new C22669g0();
        c22669g4.f89336w = c33777b2;
        InterfaceC13058l interfaceC13058lInteract = this.getConversationTurnInteractor.interact(new C0456u(c36022x, 1));
        s sVar = new s(c22669g4, c33777b2, this, aIConversation, fVar2);
        rVar2.f147346w = interfaceC13062m2;
        rVar2.f147347x = null;
        rVar2.f147348y = fVar2;
        rVar2.f147349z = null;
        rVar2.f147339E = str;
        rVar2.f147340F = null;
        rVar2.f147341G = c22669g4;
        rVar2.f147345K = 2;
        if (interfaceC13058lInteract.collect(sVar, rVar2) != obj) {
            c22669g0 = c22669g4;
            fVar3 = fVar2;
            interfaceC13062m3 = interfaceC13062m2;
            str2 = str;
            C33777b c33777b5 = (C33777b) c22669g0.f89336w;
            String turnId2 = fVar3.getTurnId();
            rVar2.f147346w = null;
            rVar2.f147347x = null;
            rVar2.f147348y = null;
            rVar2.f147349z = null;
            rVar2.f147339E = null;
            rVar2.f147340F = null;
            rVar2.f147341G = c22669g0;
            rVar2.f147342H = c22669g0;
            rVar2.f147345K = 3;
            objM110209i0 = m110209i0(interfaceC13062m3, c33777b5, str2, turnId2, rVar2);
            if (objM110209i0 != obj) {
                c22669g1 = c22669g0;
                c22669g2 = c22669g1;
                c22669g1.f89336w = objM110209i0;
                return c22669g2.f89336w;
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8 A[PHI: r1 r2
      0x02d8: PHI (r1v11 kotlin.jvm.internal.g0) = (r1v5 kotlin.jvm.internal.g0), (r1v23 kotlin.jvm.internal.g0) binds: [B:103:0x02d5, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x02d8: PHI (r2v8 vg0.g) = (r2v2 vg0.g), (r2v31 vg0.g) binds: [B:103:0x02d5, B:17:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0307  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ff A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x028d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:81:0x022b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0236  */
    /* JADX WARN: Code duplicated, block: B:88:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0241  */
    /* JADX WARN: Code duplicated, block: B:90:0x0246  */
    /* JADX WARN: Code duplicated, block: B:92:0x0249  */
    /* JADX WARN: Code duplicated, block: B:93:0x024c  */
    /* JADX WARN: Code duplicated, block: B:97:0x026d  */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0301, code lost:
    
        if (r2.collect(r3, r5) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ed, code lost:
    
        if (r2.collect(r4, r5) == r6) goto L107;
     */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110190W(ec3.InterfaceC13062m r34, tg0.C33777b r35, tg0.AbstractC33776a r36, q83.InterfaceC30057d<? super tg0.C33777b> r37) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110190W(ec3.m, tg0.b, tg0.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: X */
    private final void m110191X(InterfaceC2994c0 scope, AbstractC33776a.g action) {
        AbstractC3006f0.m8732z(scope, null, EnumC2998d0.f12007z, new w(action, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0141, code lost:
    
        if (r1.collect(r4, r0) == r15) goto L26;
     */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110192Y(ec3.InterfaceC13062m r49, tg0.C33777b r50, q83.InterfaceC30057d<? super tg0.C33777b> r51) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110192Y(ec3.m, tg0.b, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0112  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: Z */
    public final Object m110193Z(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        z zVar;
        C22669g0 c22669g0;
        AIConversation conversation;
        AIConversationMetadata metadata;
        String fingerprint;
        C22669g0 c22669g1;
        C33777b c33777b;
        InterfaceC13062m interfaceC13062m2 = interfaceC13062m;
        if (interfaceC30057d instanceof z) {
            zVar = (z) interfaceC30057d;
            int i13 = zVar.f147427G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zVar.f147427G = i13 - Integer.MIN_VALUE;
            } else {
                zVar = new z(interfaceC30057d);
            }
        } else {
            zVar = new z(interfaceC30057d);
        }
        z zVar2 = zVar;
        Object objM110211j0 = zVar2.f147425E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = zVar2.f147427G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM110211j0);
            C33777b c33777b2 = new C33777b(null, EnumC14565j.SUCCESS, EnumC26811m.SCREEN_LOADING, null, null, null, null, false, false, null, null, false, false, false, null, null, 65456, null);
            zVar2.f147428w = interfaceC13062m2;
            zVar2.f147427G = 1;
            if (interfaceC13062m2.emit(c33777b2, zVar2) != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            interfaceC13062m2 = (InterfaceC13062m) zVar2.f147428w;
            AbstractC34132o.m107864I(objM110211j0);
        } else {
            if (i14 == 2) {
                C22669g0 c22669g2 = (C22669g0) zVar2.f147429x;
                InterfaceC13062m interfaceC13062m3 = (InterfaceC13062m) zVar2.f147428w;
                AbstractC34132o.m107864I(objM110211j0);
                c22669g0 = c22669g2;
                interfaceC13062m2 = interfaceC13062m3;
                conversation = ((C33777b) c22669g0.f89336w).getConversation();
                if (conversation != null && (metadata = conversation.getMetadata()) != null && (fingerprint = metadata.getFingerprint()) != null) {
                    C33777b c33777b3 = (C33777b) c22669g0.f89336w;
                    zVar2.f147428w = null;
                    zVar2.f147429x = c22669g0;
                    zVar2.f147430y = null;
                    zVar2.f147431z = 0;
                    zVar2.f147427G = 3;
                    objM110211j0 = m110211j0(this, interfaceC13062m2, c33777b3, fingerprint, null, zVar2, 4, null);
                    if (objM110211j0 != enumC31071a) {
                        c22669g1 = c22669g0;
                    }
                    return enumC31071a;
                }
                return (C33777b) c22669g0.f89336w;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g1 = (C22669g0) zVar2.f147429x;
            AbstractC34132o.m107864I(objM110211j0);
        }
        c33777b = (C33777b) objM110211j0;
        if (c33777b == null) {
            return c33777b;
        }
        c22669g0 = c22669g1;
        return (C33777b) c22669g0.f89336w;
        C22669g0 c22669g3 = new C22669g0();
        c22669g3.f89336w = new C33777b(null, null, null, null, null, null, null, false, false, null, null, false, false, false, null, null, 65535, null);
        InterfaceC13058l interfaceC13058lInteract = this.startNewConversationInteractor.interact(new C0456u(C36007p0.f153507a, 1));
        a0 a0Var = new a0(c22669g3, this);
        zVar2.f147428w = interfaceC13062m2;
        zVar2.f147429x = c22669g3;
        zVar2.f147427G = 2;
        if (interfaceC13058lInteract.collect(a0Var, zVar2) != enumC31071a) {
            c22669g0 = c22669g3;
            conversation = ((C33777b) c22669g0.f89336w).getConversation();
            if (conversation != null) {
                C33777b c33777b4 = (C33777b) c22669g0.f89336w;
                zVar2.f147428w = null;
                zVar2.f147429x = c22669g0;
                zVar2.f147430y = null;
                zVar2.f147431z = 0;
                zVar2.f147427G = 3;
                objM110211j0 = m110211j0(this, interfaceC13062m2, c33777b4, fingerprint, null, zVar2, 4, null);
                if (objM110211j0 != enumC31071a) {
                    c22669g1 = c22669g0;
                    c33777b = (C33777b) objM110211j0;
                    if (c33777b == null) {
                        return c33777b;
                    }
                    c22669g0 = c22669g1;
                }
            }
            return (C33777b) c22669g0.f89336w;
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a0 */
    public final Object m110194a0(C33777b c33777b, AIConversation aIConversation, String str, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        b0 b0Var;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof b0) {
            b0Var = (b0) interfaceC30057d;
            int i13 = b0Var.f147082H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b0Var.f147082H = i13 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(interfaceC30057d);
            }
        } else {
            b0Var = new b0(interfaceC30057d);
        }
        Object obj = b0Var.f147080F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = b0Var.f147082H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C36013s0 c36013s0 = new C36013s0(str);
            C22669g0 c22669g1 = new C22669g0();
            c22669g1.f89336w = c33777b;
            InterfaceC13058l interfaceC13058lInteract = this.stopAllTurnsInteractor.interact(new C0456u(c36013s0, 1));
            c0 c0Var = new c0(aIConversation, c22669g1, c33777b);
            b0Var.f147083w = null;
            b0Var.f147084x = null;
            b0Var.f147085y = null;
            b0Var.f147086z = null;
            b0Var.f147079E = c22669g1;
            b0Var.f147082H = 1;
            if (interfaceC13058lInteract.collect(c0Var, b0Var) == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) b0Var.f147079E;
            AbstractC34132o.m107864I(obj);
        }
        return c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b0 */
    public final Object m110195b0(C33777b c33777b, AIConversation aIConversation, String str, String str2, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        d0 d0Var;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof d0) {
            d0Var = (d0) interfaceC30057d;
            int i13 = d0Var.f147130I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                d0Var.f147130I = i13 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(interfaceC30057d);
            }
        } else {
            d0Var = new d0(interfaceC30057d);
        }
        Object obj = d0Var.f147128G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = d0Var.f147130I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C36019v0 c36019v0 = new C36019v0(str, str2);
            C22669g0 c22669g1 = new C22669g0();
            c22669g1.f89336w = c33777b;
            InterfaceC13058l interfaceC13058lInteract = this.stopTurnInteractor.interact(new C0456u(c36019v0, 1));
            e0 e0Var = new e0(c22669g1, c33777b, this, aIConversation);
            d0Var.f147131w = null;
            d0Var.f147132x = null;
            d0Var.f147133y = null;
            d0Var.f147134z = null;
            d0Var.f147126E = null;
            d0Var.f147127F = c22669g1;
            d0Var.f147130I = 1;
            if (interfaceC13058lInteract.collect(e0Var, d0Var) == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) d0Var.f147127F;
            AbstractC34132o.m107864I(obj);
        }
        return c22669g0.f89336w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: c0 */
    public final Object m110197c0(InterfaceC13062m interfaceC13062m, C33777b c33777b, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        f0 f0Var;
        AIConversation conversation;
        String fingerprint;
        AITurn aITurn;
        Object next;
        AITurn aITurn2;
        String str;
        C33777b c33777b2;
        List<AITurn> turns;
        AITurn aITurnPrevious;
        AIConversationMetadata metadata;
        if (interfaceC30057d instanceof f0) {
            f0Var = (f0) interfaceC30057d;
            int i13 = f0Var.f147158J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                f0Var.f147158J = i13 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(interfaceC30057d);
            }
        } else {
            f0Var = new f0(interfaceC30057d);
        }
        f0 f0Var2 = f0Var;
        Object obj = f0Var2.f147156H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = f0Var2.f147158J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            conversation = c33777b.getConversation();
            fingerprint = (conversation == null || (metadata = conversation.getMetadata()) == null) ? null : metadata.getFingerprint();
            if (conversation == null || (turns = conversation.getTurns()) == null) {
                aITurn = null;
            } else {
                ListIterator<AITurn> listIterator = turns.listIterator(turns.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        aITurnPrevious = null;
                        break;
                    }
                    aITurnPrevious = listIterator.previous();
                } while (aITurnPrevious.getTurnStatus() != AiMessageStatus.ACTIVE);
                aITurn = aITurnPrevious;
            }
            String id4 = aITurn != null ? aITurn.getId() : null;
            if (fingerprint == null || AbstractC39414r.m125890i0(fingerprint) || id4 == null || AbstractC39414r.m125890i0(id4)) {
                return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            }
            Iterator<T> it = aITurn.getMessages().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((AIMessage) next).getRole(), EnumC26800b.ASSISTANT.getValue()));
            AIMessage aIMessage = (AIMessage) next;
            this.analyticsHelper.m96620a(new AbstractC31380a.f0(fingerprint, aIMessage != null ? aIMessage.getId() : null));
            Object objM106825a = c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : EnumC26811m.MESSAGE_LOADING, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
            f0Var2.f147159w = null;
            f0Var2.f147160x = c33777b;
            f0Var2.f147161y = conversation;
            f0Var2.f147162z = fingerprint;
            f0Var2.f147153E = aITurn;
            f0Var2.f147154F = id4;
            f0Var2.f147155G = null;
            f0Var2.f147158J = 1;
            if (interfaceC13062m.emit(objM106825a, f0Var2) != obj2) {
                aITurn2 = aITurn;
                str = id4;
                c33777b2 = c33777b;
            }
            return obj2;
        }
        if (i14 != 1) {
            if (i14 != 2 && i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        str = (String) f0Var2.f147154F;
        aITurn2 = (AITurn) f0Var2.f147153E;
        fingerprint = (String) f0Var2.f147162z;
        conversation = (AIConversation) f0Var2.f147161y;
        C33777b c33777b3 = (C33777b) f0Var2.f147160x;
        AbstractC34132o.m107864I(obj);
        c33777b2 = c33777b3;
        if (aITurn2.isOptimistic()) {
            f0Var2.f147159w = null;
            f0Var2.f147160x = null;
            f0Var2.f147161y = null;
            f0Var2.f147162z = null;
            f0Var2.f147153E = null;
            f0Var2.f147154F = null;
            f0Var2.f147155G = null;
            f0Var2.f147158J = 2;
            Object objM110194a0 = m110194a0(c33777b2, conversation, fingerprint, f0Var2);
            if (objM110194a0 != obj2) {
                return objM110194a0;
            }
        } else {
            f0Var2.f147159w = null;
            f0Var2.f147160x = null;
            f0Var2.f147161y = null;
            f0Var2.f147162z = null;
            f0Var2.f147153E = null;
            f0Var2.f147154F = null;
            f0Var2.f147155G = null;
            f0Var2.f147158J = 3;
            Object objM110195b0 = m110195b0(c33777b2, conversation, fingerprint, str, f0Var2);
            if (objM110195b0 != obj2) {
                return objM110195b0;
            }
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: d0 */
    public final Object m110199d0(InterfaceC13062m interfaceC13062m, C33777b c33777b, AbstractC33776a.p pVar, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        g0 g0Var;
        C22669g0 c22669g0;
        AIConversationMetadata metadata;
        if (interfaceC30057d instanceof g0) {
            g0Var = (g0) interfaceC30057d;
            int i13 = g0Var.f147179J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                g0Var.f147179J = i13 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(interfaceC30057d);
            }
        } else {
            g0Var = new g0(interfaceC30057d);
        }
        g0 g0Var2 = g0Var;
        Object obj = g0Var2.f147177H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = g0Var2.f147179J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AIConversation conversation = c33777b.getConversation();
            String fingerprint = (conversation == null || (metadata = conversation.getMetadata()) == null) ? null : metadata.getFingerprint();
            if (fingerprint == null || AbstractC39414r.m125890i0(fingerprint)) {
                return c33777b;
            }
            C36025y0 c36025y0 = new C36025y0(fingerprint, pVar.getTurnFeedback().getTurnId(), pVar.getTurnFeedback().getTypeSelected(), pVar.getTurnFeedback().getFeedback(), pVar.getShowToast());
            C22669g0 c22669g1 = new C22669g0();
            c22669g1.f89336w = c33777b;
            InterfaceC13058l interfaceC13058lInteract = this.submitTurnFeedbackInteractor.interact(new C0456u(c36025y0, 1));
            h0 h0Var = new h0(conversation, c33777b, interfaceC13062m, c22669g1);
            g0Var2.f147180w = null;
            g0Var2.f147181x = null;
            g0Var2.f147182y = null;
            g0Var2.f147183z = null;
            g0Var2.f147174E = null;
            g0Var2.f147175F = null;
            g0Var2.f147176G = c22669g1;
            g0Var2.f147179J = 1;
            if (interfaceC13058lInteract.collect(h0Var, g0Var2) == enumC31071a) {
                return enumC31071a;
            }
            c22669g0 = c22669g1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = (C22669g0) g0Var2.f147176G;
            AbstractC34132o.m107864I(obj);
        }
        return c22669g0.f89336w;
    }

    /* JADX INFO: renamed from: e0 */
    private final void m110201e0(InterfaceC2994c0 scope, C33777b accumulator, AbstractC33776a.r action) {
        AIConversationMetadata metadata;
        String fingerprint;
        AIConversation conversation = accumulator.getConversation();
        if (conversation == null || (metadata = conversation.getMetadata()) == null || (fingerprint = metadata.getFingerprint()) == null || !this.turnEndSeenTracker.m110261a(fingerprint, action.getTurnId())) {
            return;
        }
        m110225q0(scope, fingerprint, action.getTurnId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f0 */
    public final Object m110203f0(C33777b c33777b, InterfaceC2994c0 interfaceC2994c0, InterfaceC11939x interfaceC11939x, InterfaceC3027k1 interfaceC3027k1, InterfaceC30057d<? super InterfaceC3027k1> interfaceC30057d) {
        m0 m0Var;
        AIConversationMetadata metadata;
        String fingerprint;
        String pendingSuggestionsTurnId;
        String str;
        String str2;
        InterfaceC2994c0 interfaceC2994c1;
        InterfaceC11939x interfaceC11939x2;
        InterfaceC2994c0 interfaceC2994c2;
        InterfaceC11939x interfaceC11939x3;
        if (interfaceC30057d instanceof m0) {
            m0Var = (m0) interfaceC30057d;
            int i13 = m0Var.f147279I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                m0Var.f147279I = i13 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(interfaceC30057d);
            }
        } else {
            m0Var = new m0(interfaceC30057d);
        }
        Object obj = m0Var.f147277G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = m0Var.f147279I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AIConversation conversation = c33777b.getConversation();
            if (conversation != null && (metadata = conversation.getMetadata()) != null && (fingerprint = metadata.getFingerprint()) != null) {
                String pendingFirstContentSeenTurnId = c33777b.getPendingFirstContentSeenTurnId();
                if (pendingFirstContentSeenTurnId != null) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, EnumC2998d0.f12007z, new n0(fingerprint, pendingFirstContentSeenTurnId, null), 1);
                }
                pendingSuggestionsTurnId = c33777b.getPendingSuggestionsTurnId();
                if (pendingSuggestionsTurnId != null) {
                    if (interfaceC3027k1 != null) {
                        m0Var.f147280w = null;
                        m0Var.f147281x = interfaceC2994c0;
                        m0Var.f147282y = interfaceC11939x;
                        m0Var.f147283z = null;
                        m0Var.f147275E = fingerprint;
                        m0Var.f147276F = pendingSuggestionsTurnId;
                        m0Var.f147279I = 1;
                        if (AbstractC3006f0.m8716j(interfaceC3027k1, m0Var) == enumC31071a) {
                            return enumC31071a;
                        }
                        interfaceC2994c2 = interfaceC2994c0;
                        interfaceC11939x3 = interfaceC11939x;
                        str = fingerprint;
                    } else {
                        str = fingerprint;
                        str2 = pendingSuggestionsTurnId;
                        interfaceC2994c1 = interfaceC2994c0;
                        interfaceC11939x2 = interfaceC11939x;
                    }
                    return AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new o0(str, interfaceC11939x2, str2, null), 3);
                }
            }
            return interfaceC3027k1;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str3 = (String) m0Var.f147276F;
        str = (String) m0Var.f147275E;
        interfaceC11939x3 = (InterfaceC11939x) m0Var.f147282y;
        InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) m0Var.f147281x;
        AbstractC34132o.m107864I(obj);
        pendingSuggestionsTurnId = str3;
        interfaceC2994c2 = interfaceC2994c3;
        interfaceC11939x2 = interfaceC11939x3;
        str2 = pendingSuggestionsTurnId;
        interfaceC2994c1 = interfaceC2994c2;
        return AbstractC3006f0.m8732z(interfaceC2994c1, null, null, new o0(str, interfaceC11939x2, str2, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final C33777b m110205g0(AbstractC36008q result, C33777b accumulator, AIConversation conversation, AbstractC33776a.c action) {
        if (result instanceof AbstractC36008q.b) {
            return accumulator.m106825a((65279 & 1) != 0 ? accumulator.conversation : null, (65279 & 2) != 0 ? accumulator.messagingState : EnumC14565j.LOADING, (65279 & 4) != 0 ? accumulator.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? accumulator.error : null, (65279 & 16) != 0 ? accumulator.attachmentUploadModels : null, (65279 & 32) != 0 ? accumulator.toastStyle : null, (65279 & 64) != 0 ? accumulator.retryState : null, (65279 & 128) != 0 ? accumulator.isInterpolationComplete : false, (65279 & 256) != 0 ? accumulator.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? accumulator.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? accumulator.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? accumulator.openedFromHistory : false, (65279 & 4096) != 0 ? accumulator.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? accumulator.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? accumulator.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? accumulator.pendingFirstContentSeenTurnId : null);
        }
        if (result instanceof AbstractC36008q.c) {
            return accumulator.m106825a((65279 & 1) != 0 ? accumulator.conversation : m110207h0(conversation, action.getTurnId(), action.getActionId()), (65279 & 2) != 0 ? accumulator.messagingState : EnumC14565j.SUCCESS, (65279 & 4) != 0 ? accumulator.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? accumulator.error : null, (65279 & 16) != 0 ? accumulator.attachmentUploadModels : null, (65279 & 32) != 0 ? accumulator.toastStyle : null, (65279 & 64) != 0 ? accumulator.retryState : null, (65279 & 128) != 0 ? accumulator.isInterpolationComplete : false, (65279 & 256) != 0 ? accumulator.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? accumulator.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? accumulator.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? accumulator.openedFromHistory : false, (65279 & 4096) != 0 ? accumulator.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? accumulator.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? accumulator.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? accumulator.pendingFirstContentSeenTurnId : null);
        }
        if (!(result instanceof AbstractC36008q.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC36008q.a aVar = (AbstractC36008q.a) result;
        this.analyticsHelper.m96620a(new AbstractC31380a.x(conversation.getMetadata().getFingerprint(), "assistant", "support_ticket", aVar.getMessage(), null, null, 48, null));
        return accumulator.m106825a((65279 & 1) != 0 ? accumulator.conversation : null, (65279 & 2) != 0 ? accumulator.messagingState : EnumC14565j.ERROR, (65279 & 4) != 0 ? accumulator.loadingState : EnumC26811m.NONE, (65279 & 8) != 0 ? accumulator.error : aVar.getMessage(), (65279 & 16) != 0 ? accumulator.attachmentUploadModels : null, (65279 & 32) != 0 ? accumulator.toastStyle : null, (65279 & 64) != 0 ? accumulator.retryState : new C33783h(action, new C14567l("assistant", "support_ticket", aVar.getMessage())), (65279 & 128) != 0 ? accumulator.isInterpolationComplete : false, (65279 & 256) != 0 ? accumulator.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? accumulator.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? accumulator.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? accumulator.openedFromHistory : false, (65279 & 4096) != 0 ? accumulator.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? accumulator.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? accumulator.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? accumulator.pendingFirstContentSeenTurnId : null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h0 */
    private final AIConversation m110207h0(AIConversation conversation, String turnId, String actionId) {
        DesignModelWrapper designModelWrapper;
        DesignSystemModel model;
        MxmCreateCaseTileModel mxmCreateCaseTileModel;
        Iterator<AITurn> it = conversation.getTurns().iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (AbstractC22676k.m65745e(it.next().getId(), turnId)) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            return conversation;
        }
        AITurn aITurn = conversation.getTurns().get(i13);
        List<AIMessage> messages = aITurn.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        for (AIMessage aIMessage : messages) {
            List<DesignSystemModel> items = aIMessage.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            for (Object objCopy$default : items) {
                if (objCopy$default instanceof MxmCreateCaseTileModel) {
                    MxmCreateCaseTileModel mxmCreateCaseTileModel2 = (MxmCreateCaseTileModel) objCopy$default;
                    if (AbstractC22676k.m65745e(mxmCreateCaseTileModel2.getId().toString(), actionId)) {
                        objCopy$default = MxmCreateCaseTileModel.copy$default(mxmCreateCaseTileModel2, null, null, null, null, true, 15, null);
                    } else if (objCopy$default instanceof DesignModelWrapper) {
                        designModelWrapper = (DesignModelWrapper) objCopy$default;
                        model = designModelWrapper.getModel();
                        if (model instanceof MxmCreateCaseTileModel) {
                            mxmCreateCaseTileModel = (MxmCreateCaseTileModel) model;
                            if (AbstractC22676k.m65745e(mxmCreateCaseTileModel.getId().toString(), actionId)) {
                                objCopy$default = DesignModelWrapper.copy$default(designModelWrapper, MxmCreateCaseTileModel.copy$default(mxmCreateCaseTileModel, null, null, null, null, true, 15, null), null, null, null, null, 30, null);
                            } else {
                                objCopy$default = designModelWrapper;
                            }
                        } else {
                            objCopy$default = designModelWrapper;
                        }
                    }
                } else if (objCopy$default instanceof DesignModelWrapper) {
                    designModelWrapper = (DesignModelWrapper) objCopy$default;
                    model = designModelWrapper.getModel();
                    if (model instanceof MxmCreateCaseTileModel) {
                        mxmCreateCaseTileModel = (MxmCreateCaseTileModel) model;
                        if (AbstractC22676k.m65745e(mxmCreateCaseTileModel.getId().toString(), actionId)) {
                            objCopy$default = DesignModelWrapper.copy$default(designModelWrapper, MxmCreateCaseTileModel.copy$default(mxmCreateCaseTileModel, null, null, null, null, true, 15, null), null, null, null, null, 30, null);
                        } else {
                            objCopy$default = designModelWrapper;
                        }
                    } else {
                        objCopy$default = designModelWrapper;
                    }
                }
                arrayList2.add(objCopy$default);
            }
            arrayList.add(AIMessage.copy$default(aIMessage, null, null, arrayList2, 3, null));
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(conversation.getTurns());
        arrayListM74097F1.set(i13, AITurn.copy$default(aITurn, null, null, arrayList, null, null, false, 59, null));
        return AIConversation.copy$default(conversation, null, arrayListM74097F1, null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r2.m114313d(r33, r1, r9) == r10) goto L43;
     */
    /* JADX INFO: renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m110209i0(ec3.InterfaceC13062m r31, tg0.C33777b r32, java.lang.String r33, java.lang.String r34, q83.InterfaceC30057d<? super tg0.C33777b> r35) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug0.C34933b.m110209i0(ec3.m, tg0.b, java.lang.String, java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Object m110211j0(C34933b c34933b, InterfaceC13062m interfaceC13062m, C33777b c33777b, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        return c34933b.m110209i0(interfaceC13062m, c33777b, str, str2, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k0 */
    public final Object m110213k0(InterfaceC13062m interfaceC13062m, AbstractC33776a abstractC33776a, C33777b c33777b, InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C33777b> interfaceC30057d) {
        t0 t0Var;
        if (interfaceC30057d instanceof t0) {
            t0Var = (t0) interfaceC30057d;
            int i13 = t0Var.f147389G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                t0Var.f147389G = i13 - Integer.MIN_VALUE;
            } else {
                t0Var = new t0(interfaceC30057d);
            }
        } else {
            t0Var = new t0(interfaceC30057d);
        }
        Object obj = t0Var.f147387E;
        Object obj2 = EnumC31071a.f128113w;
        switch (t0Var.f147389G) {
            case 0:
                AbstractC34132o.m107864I(obj);
                this.markTurnAsSeenOrchestrator.m114312c(abstractC33776a);
                if ((abstractC33776a instanceof AbstractC33776a.o) || (abstractC33776a instanceof AbstractC33776a.e)) {
                    return c33777b;
                }
                if (abstractC33776a instanceof AbstractC33776a.b) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 1;
                    Object objM110185R = m110185R(interfaceC13062m, (AbstractC33776a.b) abstractC33776a, t0Var);
                    if (objM110185R != obj2) {
                        return objM110185R;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.n) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 2;
                    Object objM110193Z = m110193Z(interfaceC13062m, t0Var);
                    if (objM110193Z != obj2) {
                        return objM110193Z;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.f) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 3;
                    Object objM110189V = m110189V(interfaceC13062m, c33777b, (AbstractC33776a.f) abstractC33776a, t0Var);
                    if (objM110189V != obj2) {
                        return objM110189V;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.d) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 4;
                    Object objM110187T = m110187T(interfaceC13062m, c33777b, (AbstractC33776a.d) abstractC33776a, t0Var);
                    if (objM110187T != obj2) {
                        return objM110187T;
                    }
                } else if ((abstractC33776a instanceof AbstractC33776a.u) || (abstractC33776a instanceof AbstractC33776a.k)) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 5;
                    Object objM110190W = m110190W(interfaceC13062m, c33777b, abstractC33776a, t0Var);
                    if (objM110190W != obj2) {
                        return objM110190W;
                    }
                } else if ((abstractC33776a instanceof AbstractC33776a.t) || (abstractC33776a instanceof AbstractC33776a.j)) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 6;
                    Object objM110188U = m110188U(interfaceC13062m, c33777b, abstractC33776a, t0Var);
                    if (objM110188U != obj2) {
                        return objM110188U;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.p) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 7;
                    Object objM110199d0 = m110199d0(interfaceC13062m, c33777b, (AbstractC33776a.p) abstractC33776a, t0Var);
                    if (objM110199d0 != obj2) {
                        return objM110199d0;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.c) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 8;
                    Object objM110186S = m110186S(interfaceC13062m, c33777b, (AbstractC33776a.c) abstractC33776a, t0Var);
                    if (objM110186S != obj2) {
                        return objM110186S;
                    }
                } else if (abstractC33776a instanceof AbstractC33776a.a) {
                    t0Var.f147390w = null;
                    t0Var.f147391x = null;
                    t0Var.f147392y = null;
                    t0Var.f147393z = null;
                    t0Var.f147389G = 9;
                    Object objM110184Q = m110184Q(interfaceC13062m, c33777b, (AbstractC33776a.a) abstractC33776a, t0Var);
                    if (objM110184Q != obj2) {
                        return objM110184Q;
                    }
                } else {
                    if (abstractC33776a instanceof AbstractC33776a.l) {
                        return c33777b;
                    }
                    if (abstractC33776a instanceof AbstractC33776a.r) {
                        m110201e0(interfaceC2994c0, c33777b, (AbstractC33776a.r) abstractC33776a);
                        return c33777b;
                    }
                    if (abstractC33776a instanceof AbstractC33776a.s) {
                        AbstractC33776a.s sVar = (AbstractC33776a.s) abstractC33776a;
                        this.turnEndSeenTracker.m110263d(sVar.getTurnId(), sVar.getIsVisible());
                        m110221o0(interfaceC2994c0, c33777b);
                        return c33777b;
                    }
                    if (abstractC33776a instanceof AbstractC33776a.h) {
                        this.turnEndSeenTracker.m110262c(((AbstractC33776a.h) abstractC33776a).getIsVisible());
                        m110221o0(interfaceC2994c0, c33777b);
                        return c33777b;
                    }
                    if (abstractC33776a instanceof AbstractC33776a.g) {
                        AbstractC33776a.g gVar = (AbstractC33776a.g) abstractC33776a;
                        m110191X(interfaceC2994c0, gVar);
                        return m110223p0(c33777b, gVar);
                    }
                    if (AbstractC22676k.m65745e(abstractC33776a, AbstractC33776a.i.f141397a)) {
                        t0Var.f147390w = null;
                        t0Var.f147391x = null;
                        t0Var.f147392y = null;
                        t0Var.f147393z = null;
                        t0Var.f147389G = 10;
                        Object objM110192Y = m110192Y(interfaceC13062m, c33777b, t0Var);
                        if (objM110192Y != obj2) {
                            return objM110192Y;
                        }
                    } else {
                        if (!(abstractC33776a instanceof AbstractC33776a.m)) {
                            if (abstractC33776a instanceof AbstractC33776a.q) {
                                return m110177J(c33777b, (AbstractC33776a.q) abstractC33776a);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC4328b error = ((AbstractC33776a.m) abstractC33776a).getError();
                        t0Var.f147390w = null;
                        t0Var.f147391x = null;
                        t0Var.f147392y = c33777b;
                        t0Var.f147393z = null;
                        t0Var.f147389G = 11;
                        if (m110182O(interfaceC13062m, c33777b, error, t0Var) != obj2) {
                            return c33777b;
                        }
                    }
                }
                return obj2;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                AbstractC34132o.m107864I(obj);
                return obj;
            case 11:
                C33777b c33777b2 = (C33777b) t0Var.f147392y;
                AbstractC34132o.m107864I(obj);
                return c33777b2;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final AIConversation m110215l0(AIConversation conversation) {
        AITurn aITurn = (AITurn) AbstractC25265s.m74100H0(conversation.getTurns());
        if (aITurn == null) {
            return conversation;
        }
        List<AIMessage> messages = aITurn.getMessages();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(messages, 10));
        for (AIMessage aIMessage : messages) {
            List<DesignSystemModel> items = aIMessage.getItems();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (!m110217m0(obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(AIMessage.copy$default(aIMessage, null, null, arrayList2, 3, null));
        }
        return m110176I(conversation, AITurn.copy$default(aITurn, null, null, arrayList, null, null, false, 59, null));
    }

    /* JADX INFO: renamed from: m0 */
    private static final boolean m110217m0(Object obj) {
        if (obj instanceof SuggestionBubbleModel) {
            return true;
        }
        return (obj instanceof DesignModelWrapper) && (((DesignModelWrapper) obj).getModel() instanceof SuggestionBubbleModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final AIConversation m110219n0(AIConversation conversation, AITurn turn) {
        AITurn aITurn = (AITurn) AbstractC25265s.m74114R0(conversation.getTurns());
        if (aITurn != null) {
            boolean z4 = true;
            if (aITurn.isOptimistic()) {
                if (turn.getTurnStatus() != AiMessageStatus.FAILED && turn.getTurnStatus() != AiMessageStatus.FLAGGED) {
                    z4 = false;
                }
                if (!z4 || AbstractC38270b.m122611a(turn)) {
                    if (!z4 && (!AbstractC38270b.m122611a(turn) || !AbstractC38270b.m122612b(turn))) {
                        return conversation;
                    }
                    ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(conversation.getTurns());
                    arrayListM74097F1.set(AbstractC37056f.m118951C(arrayListM74097F1), AITurn.copy$default(turn, null, null, null, null, null, false, 31, null));
                    return AIConversation.copy$default(conversation, null, arrayListM74097F1, null, null, null, 29, null);
                }
                List<AITurn> turns = conversation.getTurns();
                ArrayList arrayList = new ArrayList();
                for (Object obj : turns) {
                    if (!((AITurn) obj).isOptimistic()) {
                        arrayList.add(obj);
                    }
                }
                return AIConversation.copy$default(conversation, null, arrayList, null, null, null, 29, null);
            }
        }
        return m110176I(conversation, turn);
    }

    /* JADX INFO: renamed from: o0 */
    private final void m110221o0(InterfaceC2994c0 scope, C33777b accumulator) {
        AIConversationMetadata metadata;
        String fingerprint;
        AIConversation conversation = accumulator.getConversation();
        if (conversation == null || (metadata = conversation.getMetadata()) == null || (fingerprint = metadata.getFingerprint()) == null) {
            return;
        }
        Iterator<T> it = this.turnEndSeenTracker.m110264e(accumulator).iterator();
        while (it.hasNext()) {
            m110225q0(scope, fingerprint, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final C33777b m110223p0(C33777b accumulator, AbstractC33776a.g action) {
        AIConversation conversation = accumulator.getConversation();
        return (conversation != null && AbstractC22676k.m65745e(conversation.getMetadata().getFingerprint(), action.getFingerprint())) ? accumulator.m106825a((65279 & 1) != 0 ? accumulator.conversation : AIConversation.copy$default(conversation, AIConversationMetadata.copy$default(conversation.getMetadata(), null, null, null, null, null, null, null, action.getTurnId(), 127, null), null, null, null, null, 30, null), (65279 & 2) != 0 ? accumulator.messagingState : null, (65279 & 4) != 0 ? accumulator.loadingState : null, (65279 & 8) != 0 ? accumulator.error : null, (65279 & 16) != 0 ? accumulator.attachmentUploadModels : null, (65279 & 32) != 0 ? accumulator.toastStyle : null, (65279 & 64) != 0 ? accumulator.retryState : null, (65279 & 128) != 0 ? accumulator.isInterpolationComplete : false, (65279 & 256) != 0 ? accumulator.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? accumulator.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? accumulator.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? accumulator.openedFromHistory : false, (65279 & 4096) != 0 ? accumulator.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? accumulator.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? accumulator.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? accumulator.pendingFirstContentSeenTurnId : null) : accumulator;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m110225q0(InterfaceC2994c0 scope, String fingerprint, String turnId) {
        AbstractC3006f0.m8732z(scope, null, EnumC2998d0.f12007z, new u0(fingerprint, turnId, null), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final AIConversation m110227r0(AIConversation conversation, String turnId, TurnFeedbackResponse feedback) {
        List<AITurn> turns = conversation.getTurns();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(turns, 10));
        for (AITurn aITurnCopy$default : turns) {
            if (AbstractC22676k.m65745e(aITurnCopy$default.getId(), turnId)) {
                aITurnCopy$default = AITurn.copy$default(aITurnCopy$default, null, null, null, feedback, null, false, 55, null);
            }
            arrayList.add(aITurnCopy$default);
        }
        return AIConversation.copy$default(conversation, null, arrayList, null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final C33777b m110229s0(C33777b c33777b) {
        return c33777b.m106825a((65279 & 1) != 0 ? c33777b.conversation : null, (65279 & 2) != 0 ? c33777b.messagingState : null, (65279 & 4) != 0 ? c33777b.loadingState : null, (65279 & 8) != 0 ? c33777b.error : null, (65279 & 16) != 0 ? c33777b.attachmentUploadModels : null, (65279 & 32) != 0 ? c33777b.toastStyle : null, (65279 & 64) != 0 ? c33777b.retryState : null, (65279 & 128) != 0 ? c33777b.isInterpolationComplete : false, (65279 & 256) != 0 ? c33777b.isAwaitingMoreTokens : false, (65279 & 512) != 0 ? c33777b.attachmentError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33777b.submitError : null, (65279 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33777b.openedFromHistory : false, (65279 & 4096) != 0 ? c33777b.isRefreshingMetadata : false, (65279 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33777b.isDay0 : false, (65279 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33777b.pendingSuggestionsTurnId : null, (65279 & 32768) != 0 ? c33777b.pendingFirstContentSeenTurnId : null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        i0 i0Var = new i0(upstream);
        InterfaceC13058l interfaceC13058lM36599i = AbstractC13091v.m36599i(new j0(upstream), Integer.MAX_VALUE, 2);
        C22669g0 c22669g0 = new C22669g0();
        C33777b c33777b = new C33777b(null, null, null, null, null, null, null, false, false, null, null, false, false, false, null, null, 65535, null);
        c22669g0.f89336w = c33777b;
        return AbstractC13091v.m36584J(new C0456u(c33777b, 1), AbstractC13091v.m36590P(i0Var, new k0(null, this, interfaceC13058lM36599i, c22669g0)));
    }
}
