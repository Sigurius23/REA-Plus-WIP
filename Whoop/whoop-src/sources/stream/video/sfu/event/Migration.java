package stream.video.sfu.event;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.InterfaceC5570a0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import m83.C25271y;
import ne3.C26624l;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import s30.AbstractC32103e;
import stream.video.sfu.models.TrackInfo;
import stream.video.sfu.signal.TrackSubscriptionDetails;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B;\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006#"}, m65681d2 = {"Lstream/video/sfu/event/Migration;", "Lcom/squareup/wire/l;", "", "", "from_sfu_id", "", "Lstream/video/sfu/models/TrackInfo;", "announced_tracks", "Lstream/video/sfu/signal/TrackSubscriptionDetails;", "subscriptions", "Lne3/l;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lne3/l;)Lstream/video/sfu/event/Migration;", "Ljava/lang/String;", "getFrom_sfu_id", "Ljava/util/List;", "getAnnounced_tracks", "()Ljava/util/List;", "getSubscriptions", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class Migration extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.TrackInfo#ADAPTER", jsonName = "announcedTracks", label = EnumC5595z.f22136y, tag = 2)
    private final List<TrackInfo> announced_tracks;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fromSfuId", label = EnumC5595z.f22132F, tag = 1)
    private final String from_sfu_id;

    @InterfaceC5570a0(adapter = "stream.video.sfu.signal.TrackSubscriptionDetails#ADAPTER", label = EnumC5595z.f22136y, tag = 3)
    private final List<TrackSubscriptionDetails> subscriptions;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Migration.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.event.Migration$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public Migration decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jM16807d = reader.m16807d();
                Object objDecode = "";
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new Migration((String) objDecode, arrayList, arrayList2, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = AbstractC5586q.STRING.decode(reader);
                    } else if (iM16810g == 2) {
                        arrayList.add(TrackInfo.ADAPTER.decode(reader));
                    } else if (iM16810g != 3) {
                        reader.m16813j(iM16810g);
                    } else {
                        arrayList2.add(TrackSubscriptionDetails.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(Migration value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (!AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    iMo79253d += AbstractC5586q.STRING.encodedSizeWithTag(1, value.getFrom_sfu_id());
                }
                return TrackSubscriptionDetails.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSubscriptions()) + TrackInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getAnnounced_tracks()) + iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public Migration redact(Migration value) {
                AbstractC22676k.m65750j(value, "value");
                return Migration.copy$default(value, null, AbstractC32103e.m99879a(value.getAnnounced_tracks(), TrackInfo.ADAPTER), AbstractC32103e.m99879a(value.getSubscriptions(), TrackSubscriptionDetails.ADAPTER), C26624l.f105881E, 1, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, Migration value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (!AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getFrom_sfu_id());
                }
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getAnnounced_tracks());
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getSubscriptions());
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, Migration value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                TrackSubscriptionDetails.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getSubscriptions());
                TrackInfo.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.getAnnounced_tracks());
                if (AbstractC22676k.m65745e(value.getFrom_sfu_id(), "")) {
                    return;
                }
                AbstractC5586q.STRING.encodeWithTag(writer, 1, value.getFrom_sfu_id());
            }
        };
    }

    public Migration() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Migration copy$default(Migration migration, String str, List list, List list2, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = migration.from_sfu_id;
        }
        if ((i13 & 2) != 0) {
            list = migration.announced_tracks;
        }
        if ((i13 & 4) != 0) {
            list2 = migration.subscriptions;
        }
        if ((i13 & 8) != 0) {
            c26624l = migration.unknownFields();
        }
        return migration.copy(str, list, list2, c26624l);
    }

    public final Migration copy(String from_sfu_id, List<TrackInfo> announced_tracks, List<TrackSubscriptionDetails> subscriptions, C26624l unknownFields) {
        AbstractC22676k.m65750j(from_sfu_id, "from_sfu_id");
        AbstractC22676k.m65750j(announced_tracks, "announced_tracks");
        AbstractC22676k.m65750j(subscriptions, "subscriptions");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new Migration(from_sfu_id, announced_tracks, subscriptions, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Migration)) {
            return false;
        }
        Migration migration = (Migration) other;
        return AbstractC22676k.m65745e(unknownFields(), migration.unknownFields()) && AbstractC22676k.m65745e(this.from_sfu_id, migration.from_sfu_id) && AbstractC22676k.m65745e(this.announced_tracks, migration.announced_tracks) && AbstractC22676k.m65745e(this.subscriptions, migration.subscriptions);
    }

    public final List<TrackInfo> getAnnounced_tracks() {
        return this.announced_tracks;
    }

    public final String getFrom_sfu_id() {
        return this.from_sfu_id;
    }

    public final List<TrackSubscriptionDetails> getSubscriptions() {
        return this.subscriptions;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = this.subscriptions.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(unknownFields().hashCode() * 37, 37, this.from_sfu_id), 37, this.announced_tracks);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134503newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC21702c.m61149t(arrayList, this.from_sfu_id, "from_sfu_id=");
        if (!this.announced_tracks.isEmpty()) {
            AbstractC26725a.m79513q("announced_tracks=", this.announced_tracks, arrayList);
        }
        if (!this.subscriptions.isEmpty()) {
            AbstractC26725a.m79513q("subscriptions=", this.subscriptions, arrayList);
        }
        return AbstractC25265s.m74110N0(arrayList, ", ", "Migration{", "}", null, 56);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Migration(String str, List list, List list2, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134503newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Migration(String from_sfu_id, List<TrackInfo> announced_tracks, List<TrackSubscriptionDetails> subscriptions, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(from_sfu_id, "from_sfu_id");
        AbstractC22676k.m65750j(announced_tracks, "announced_tracks");
        AbstractC22676k.m65750j(subscriptions, "subscriptions");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.from_sfu_id = from_sfu_id;
        this.announced_tracks = AbstractC32103e.m99886h("announced_tracks", announced_tracks);
        this.subscriptions = AbstractC32103e.m99886h("subscriptions", subscriptions);
    }
}
