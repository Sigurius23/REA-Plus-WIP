.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00080\u0008\u0087\u0008\u0018\u0000 |2\u00020\u0001:\u0002}|B\u00e7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00ed\u0001\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000c\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001e\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010\'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\'J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010\'J\u0012\u0010-\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010\'J\u0012\u0010.\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0010\u00103\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010\'J\u0012\u00104\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00084\u00105J \u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010\'J\u0012\u0010A\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010\'J\u0088\u0002\u0010B\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0018\u0008\u0002\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000c2\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008B\u0010CJ\u0010\u0010D\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008D\u0010\'J\u0010\u0010E\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008E\u0010%J\u001a\u0010G\u001a\u00020\u000c2\u0008\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008G\u0010HJ\'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001\u00a2\u0006\u0004\u0008O\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010R\u001a\u0004\u0008S\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010T\u0012\u0004\u0008V\u0010W\u001a\u0004\u0008U\u0010\'R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010T\u0012\u0004\u0008Y\u0010W\u001a\u0004\u0008X\u0010\'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010T\u001a\u0004\u0008Z\u0010\'R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010T\u001a\u0004\u0008[\u0010\'R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010T\u0012\u0004\u0008]\u0010W\u001a\u0004\u0008\\\u0010\'R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010T\u0012\u0004\u0008_\u0010W\u001a\u0004\u0008^\u0010\'R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010T\u0012\u0004\u0008a\u0010W\u001a\u0004\u0008`\u0010\'R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010b\u0012\u0004\u0008c\u0010W\u001a\u0004\u0008\r\u0010/R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010b\u0012\u0004\u0008d\u0010W\u001a\u0004\u0008\u000e\u0010/R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010e\u0012\u0004\u0008g\u0010W\u001a\u0004\u0008f\u00102R \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010T\u0012\u0004\u0008i\u0010W\u001a\u0004\u0008h\u0010\'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010j\u001a\u0004\u0008k\u00105R0\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010l\u0012\u0004\u0008n\u0010W\u001a\u0004\u0008m\u00107R \u0010\u0016\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010o\u0012\u0004\u0008q\u0010W\u001a\u0004\u0008p\u00109R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010r\u0012\u0004\u0008t\u0010W\u001a\u0004\u0008s\u0010;R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010u\u0012\u0004\u0008w\u0010W\u001a\u0004\u0008v\u0010=R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010x\u001a\u0004\u0008y\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010T\u001a\u0004\u0008z\u0010\'R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010T\u001a\u0004\u0008{\u0010\'\u00a8\u0006~"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        "",
        "",
        "id",
        "",
        "title",
        "subtitle",
        "content",
        "imageUrl",
        "imageAlt",
        "webViewUrl",
        "webViewTitle",
        "",
        "isTimerActive",
        "isBthr",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "mysticResponse",
        "cta",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
        "inputType",
        "",
        "inputConfig",
        "countDownTimerRequired",
        "countDownTimerSeconds",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;",
        "btHrConfig",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "surveyProvider",
        "surveyFormId",
        "surveyVendorMetadata",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Ljava/lang/Boolean;",
        "component10",
        "component11",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "component12",
        "component13",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
        "component14",
        "()Ljava/util/Map;",
        "component15",
        "()Z",
        "component16",
        "()Ljava/lang/Integer;",
        "component17",
        "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;",
        "component18",
        "()Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "component19",
        "component20",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whooplabs_release",
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "I",
        "getId",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "getSubtitle",
        "getSubtitle$annotations",
        "getContent",
        "getImageUrl",
        "getImageAlt",
        "getImageAlt$annotations",
        "getWebViewUrl",
        "getWebViewUrl$annotations",
        "getWebViewTitle",
        "getWebViewTitle$annotations",
        "Ljava/lang/Boolean;",
        "isTimerActive$annotations",
        "isBthr$annotations",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "getMysticResponse",
        "getMysticResponse$annotations",
        "getCta",
        "getCta$annotations",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
        "getInputType",
        "Ljava/util/Map;",
        "getInputConfig",
        "getInputConfig$annotations",
        "Z",
        "getCountDownTimerRequired",
        "getCountDownTimerRequired$annotations",
        "Ljava/lang/Integer;",
        "getCountDownTimerSeconds",
        "getCountDownTimerSeconds$annotations",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;",
        "getBtHrConfig",
        "getBtHrConfig$annotations",
        "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
        "getSurveyProvider",
        "getSurveyFormId",
        "getSurveyVendorMetadata",
        "Companion",
        "$serializer",
        "whooplabs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;


# instance fields
.field private final btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

.field private final content:Ljava/lang/String;

.field private final countDownTimerRequired:Z

.field private final countDownTimerSeconds:Ljava/lang/Integer;

.field private final cta:Ljava/lang/String;

.field private final id:I

.field private final imageAlt:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final inputConfig:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

.field private final isBthr:Ljava/lang/Boolean;

.field private final isTimerActive:Ljava/lang/Boolean;

.field private final mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

.field private final subtitle:Ljava/lang/String;

.field private final surveyFormId:Ljava/lang/String;

.field private final surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

.field private final surveyVendorMetadata:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final webViewTitle:Ljava/lang/String;

.field private final webViewUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Ldq2/a;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Ldq2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Ldx2/a;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Ldx2/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x14

    new-array v4, v4, [Ll83/h;

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v5, 0x7

    aput-object v1, v4, v5

    aput-object v1, v4, v0

    const/16 v0, 0x9

    aput-object v1, v4, v0

    const/16 v0, 0xa

    aput-object v1, v4, v0

    const/16 v0, 0xb

    aput-object v1, v4, v0

    const/16 v0, 0xc

    aput-object v3, v4, v0

    const/16 v0, 0xd

    aput-object v1, v4, v0

    const/16 v0, 0xe

    aput-object v1, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    const/16 v0, 0x10

    aput-object v1, v4, v0

    const/16 v0, 0x11

    aput-object v2, v4, v0

    const/16 v0, 0x12

    aput-object v1, v4, v0

    const/16 v0, 0x13

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x3cff

    const/16 v1, 0x3cff

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 3
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    :goto_0
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_2

    .line 4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    :goto_1
    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_3

    const/4 p2, 0x0

    :goto_2
    iput-boolean p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    goto :goto_3

    :cond_3
    move/from16 p2, p16

    goto :goto_2

    :goto_3
    const p2, 0x8000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    :goto_4
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    goto :goto_5

    :cond_5
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    :goto_5
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    goto :goto_6

    :cond_6
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    :goto_6
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    :goto_7
    const/high16 p2, 0x80000

    and-int/2addr p1, p2

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    return-void

    :cond_8
    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;Z",
            "Ljava/lang/Integer;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;",
            "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "cta"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    .line 8
    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    .line 9
    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    .line 10
    iput-object p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    .line 11
    iput-object p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    .line 12
    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    .line 13
    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    .line 14
    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    .line 15
    iput-object p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    .line 16
    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    .line 17
    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    .line 18
    iput-object p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    .line 19
    iput-object p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    .line 20
    iput-object p14, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    move/from16 p1, p15

    .line 21
    iput-boolean p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    move-object/from16 p1, p16

    .line 22
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    move-object/from16 p1, p17

    .line 23
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    move-object/from16 p1, p18

    .line 24
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object/from16 p1, p19

    .line 25
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 26
    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    move/from16 v0, p21

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object/from16 v11, p9

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    .line 28
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v12, v1

    goto :goto_1

    :cond_1
    move-object/from16 v12, p10

    :goto_1
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move/from16 v17, v1

    goto :goto_2

    :cond_2
    move/from16 v17, p15

    :goto_2
    const v1, 0x8000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    move-object/from16 v18, v2

    goto :goto_3

    :cond_3
    move-object/from16 v18, p16

    :goto_3
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_4

    move-object/from16 v19, v2

    goto :goto_4

    :cond_4
    move-object/from16 v19, p17

    :goto_4
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_5

    move-object/from16 v20, v2

    goto :goto_5

    :cond_5
    move-object/from16 v20, p18

    :goto_5
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_6

    move-object/from16 v21, v2

    goto :goto_6

    :cond_6
    move-object/from16 v21, p19

    :goto_6
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    move-object/from16 v22, v2

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v2, p0

    goto :goto_7

    :cond_7
    move-object/from16 v22, p20

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    .line 29
    :goto_7
    invoke-direct/range {v2 .. v22}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType$Companion;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/domain/SurveyProvider;->Companion:Lcom/whoop/whooplabs/data/domain/SurveyProvider$Companion;

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/domain/SurveyProvider$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-boolean v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    goto :goto_e

    :cond_e
    move/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_13
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getBtHrConfig$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bthrs_config"
    .end annotation

    return-void
.end method

.method public static synthetic getCountDownTimerRequired$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "countdown_timer_required"
    .end annotation

    return-void
.end method

.method public static synthetic getCountDownTimerSeconds$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "countdown_timer_seconds"
    .end annotation

    return-void
.end method

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_display"
    .end annotation

    return-void
.end method

.method public static synthetic getImageAlt$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "image_alt_text"
    .end annotation

    return-void
.end method

.method public static synthetic getInputConfig$annotations()V
    .locals 0
    .annotation runtime Lwc3/i;
        with = Lhx2/a;
    .end annotation

    return-void
.end method

.method public static synthetic getMysticResponse$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "mystic_config"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "page_subtitle_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "page_title_display"
    .end annotation

    return-void
.end method

.method public static synthetic getWebViewTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "webview_title_text"
    .end annotation

    return-void
.end method

.method public static synthetic getWebViewUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "webview_url"
    .end annotation

    return-void
.end method

.method public static synthetic isBthr$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "bthrs_step"
    .end annotation

    return-void
.end method

.method public static synthetic isTimerActive$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "show_timer"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :goto_1
    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    sget-object v2, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    const/16 v4, 0xa

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0xc

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lhx2/a;->a:Lhx2/a;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    const/16 v4, 0xd

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xe

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    if-eqz v3, :cond_5

    :goto_2
    iget-boolean v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/16 v2, 0xf

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    if-eqz v3, :cond_7

    :goto_3
    sget-object v3, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/16 v2, 0x10

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    if-eqz v3, :cond_9

    :goto_4
    sget-object v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse$$serializer;

    iget-object v4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/16 v2, 0x11

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-eqz v3, :cond_b

    :goto_5
    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    if-eqz v2, :cond_f

    :goto_7
    iget-object p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    return-object v0
.end method

.method public final component14()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    return-object v0
.end method

.method public final component15()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    return v0
.end method

.method public final component16()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component17()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    return-object v0
.end method

.method public final component18()Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
            "Ljava/lang/String;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;Z",
            "Ljava/lang/Integer;",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;",
            "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;"
        }
    .end annotation

    const-string v0, "cta"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;ZLjava/lang/Integer;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getBtHrConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    return-object v0
.end method

.method public final getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    return-object v0
.end method

.method public final getCountDownTimerRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    return v0
.end method

.method public final getCountDownTimerSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    return v0
.end method

.method public final getImageAlt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getInputConfig()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    return-object v0
.end method

.method public final getInputType()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    return-object v0
.end method

.method public final getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSurveyFormId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSurveyProvider()Lcom/whoop/whooplabs/data/domain/SurveyProvider;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-object v0
.end method

.method public final getSurveyVendorMetadata()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getWebViewUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    if-nez v1, :cond_10

    goto :goto_10

    :cond_10
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_10
    add-int/2addr v0, v3

    return v0
.end method

.method public final isBthr()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final isTimerActive()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->id:I

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->title:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->subtitle:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->content:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->imageAlt:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewUrl:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->webViewTitle:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive:Ljava/lang/Boolean;

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr:Ljava/lang/Boolean;

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->mysticResponse:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    iget-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->cta:Ljava/lang/String;

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputType:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->inputConfig:Ljava/util/Map;

    iget-boolean v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerRequired:Z

    move/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->countDownTimerSeconds:Ljava/lang/Integer;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->btHrConfig:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyProvider:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyFormId:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->surveyVendorMetadata:Ljava/lang/String;

    const-string v0, ", title="

    move-object/from16 v21, v15

    const-string v15, ", subtitle="

    move-object/from16 v22, v14

    const-string v14, "CampaignStepResponse(id="

    invoke-static {v1, v14, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", content="

    const-string v2, ", imageUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", imageAlt="

    const-string v2, ", webViewUrl="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", webViewTitle="

    const-string v2, ", isTimerActive="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isBthr="

    const-string v2, ", mysticResponse="

    invoke-static {v0, v9, v1, v10, v2}, Lc13/a;->w(Ljava/lang/StringBuilder;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", inputType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inputConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countDownTimerRequired="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", countDownTimerSeconds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", btHrConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyProvider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyFormId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", surveyVendorMetadata="

    const-string v2, ")"

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
