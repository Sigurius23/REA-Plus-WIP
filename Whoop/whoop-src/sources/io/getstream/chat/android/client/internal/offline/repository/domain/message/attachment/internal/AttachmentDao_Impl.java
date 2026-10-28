package io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal;

import androidx.room.AbstractC1848z0;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import h02.C16574h;
import hu1.C17650g;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "", "messageId", "Lec3/l;", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;", "observeAttachmentsForMessage", "(Ljava/lang/String;)Lec3/l;", "Ll83/a0;", "deleteAll", "()V", "Landroidx/room/z0;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentDao_Impl implements AttachmentDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public AttachmentDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__extraDataConverter = new ExtraDataConverter();
        this.__db = __db;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m54697b(String str, AttachmentDao_Impl attachmentDao_Impl, InterfaceC33687a interfaceC33687a) {
        return (ArrayList) observeAttachmentsForMessage$lambda$0("SELECT * FROM attachment_inner_entity WHERE messageId == ?", str, attachmentDao_Impl, interfaceC33687a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteAll$lambda$1(String str, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    private static final List observeAttachmentsForMessage$lambda$0(String str, String str2, AttachmentDao_Impl attachmentDao_Impl, InterfaceC33687a _connection) throws Exception {
        int i13;
        UploadStateEntity uploadStateEntity;
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "messageId");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "authorName");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "titleLink");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "authorLink");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "thumbUrl");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "imageUrl");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "assetUrl");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "ogUrl");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "mimeType");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "fileSize");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "title");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "text");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "type");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "image");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "fallback");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "uploadFilePath");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalHeight");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "originalWidth");
            int iM60658N21 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            int iM60658N22 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "statusCode");
            int iM60658N23 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "errorMessage");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                String strMo5353J3 = interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4);
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                String strMo5353J5 = interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6);
                String strMo5353J6 = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N7);
                String strMo5353J7 = interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8);
                String strMo5353J8 = interfaceC33689cMo68212g1.isNull(iM60658N9) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N9);
                String strMo5353J9 = interfaceC33689cMo68212g1.isNull(iM60658N10) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N10);
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N11);
                String strMo5353J10 = interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12);
                String strMo5353J11 = interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13);
                String strMo5353J12 = interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N14);
                int i15 = iM60658N15;
                String strMo5353J13 = interfaceC33689cMo68212g1.isNull(i15) ? null : interfaceC33689cMo68212g1.mo5353J0(i15);
                int i16 = iM60658N;
                int i17 = iM60658N16;
                String strMo5353J14 = interfaceC33689cMo68212g1.isNull(i17) ? null : interfaceC33689cMo68212g1.mo5353J0(i17);
                iM60658N16 = i17;
                int i18 = iM60658N17;
                String strMo5353J15 = interfaceC33689cMo68212g1.isNull(i18) ? null : interfaceC33689cMo68212g1.mo5353J0(i18);
                iM60658N17 = i18;
                int i19 = iM60658N18;
                String strMo5353J16 = interfaceC33689cMo68212g1.isNull(i19) ? null : interfaceC33689cMo68212g1.mo5353J0(i19);
                iM60658N18 = i19;
                int i24 = iM60658N19;
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(i24) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i24));
                int i25 = iM60658N20;
                Integer numValueOf2 = interfaceC33689cMo68212g1.isNull(i25) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(i25));
                int i26 = iM60658N21;
                Map<String, Object> mapStringToMap = attachmentDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(i26) ? null : interfaceC33689cMo68212g1.mo5353J0(i26));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                int i27 = iM60658N22;
                if (interfaceC33689cMo68212g1.isNull(i27)) {
                    i13 = iM60658N23;
                    if (interfaceC33689cMo68212g1.isNull(i13)) {
                        uploadStateEntity = null;
                    }
                    arrayList.add(new AttachmentEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, i14, strMo5353J10, strMo5353J11, strMo5353J12, strMo5353J13, strMo5353J14, strMo5353J15, strMo5353J16, numValueOf, numValueOf2, uploadStateEntity, mapStringToMap));
                    iM60658N = i16;
                    iM60658N15 = i15;
                    iM60658N19 = i24;
                    iM60658N5 = iM60658N5;
                    iM60658N6 = iM60658N6;
                    iM60658N22 = i27;
                    iM60658N21 = i26;
                    iM60658N23 = i13;
                    iM60658N4 = iM60658N4;
                    iM60658N2 = iM60658N2;
                    iM60658N3 = iM60658N3;
                    iM60658N20 = i25;
                } else {
                    i13 = iM60658N23;
                }
                uploadStateEntity = new UploadStateEntity((int) interfaceC33689cMo68212g1.getLong(i27), interfaceC33689cMo68212g1.isNull(i13) ? null : interfaceC33689cMo68212g1.mo5353J0(i13));
                arrayList.add(new AttachmentEntity(strMo5353J0, strMo5353J1, strMo5353J2, strMo5353J3, strMo5353J4, strMo5353J5, strMo5353J6, strMo5353J7, strMo5353J8, strMo5353J9, i14, strMo5353J10, strMo5353J11, strMo5353J12, strMo5353J13, strMo5353J14, strMo5353J15, strMo5353J16, numValueOf, numValueOf2, uploadStateEntity, mapStringToMap));
                iM60658N = i16;
                iM60658N15 = i15;
                iM60658N19 = i24;
                iM60658N5 = iM60658N5;
                iM60658N6 = iM60658N6;
                iM60658N22 = i27;
                iM60658N21 = i26;
                iM60658N23 = i13;
                iM60658N4 = iM60658N4;
                iM60658N2 = iM60658N2;
                iM60658N3 = iM60658N3;
                iM60658N20 = i25;
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao
    public final void deleteAll() {
        AbstractC15751g.m44432L(this.__db, false, true, new C17650g(11));
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal.AttachmentDao
    public final InterfaceC13058l observeAttachmentsForMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return AbstractC12350b.m34591l(this.__db, new String[]{AttachmentEntity.ATTACHMENT_ENTITY_TABLE_NAME}, new C16574h(12, messageId, this));
    }
}
