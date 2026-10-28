.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;,
        Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00081\u0008\u0087\u0008\u0018\u0000 y2\u00020\u0001:\u0002zyB\u00c7\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u00f9\u0001\u0008\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u0010\u0010)\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010$J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010$J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010$J\u0010\u0010,\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010$J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010$J\u0010\u00100\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010\'J\u0010\u00101\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010\'J\u0010\u00102\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010$J\u0010\u00103\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010$J\u0010\u00104\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010$J\u0010\u00105\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010-J\u0010\u00106\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00086\u0010$J\u0010\u00107\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00087\u0010$J\u0010\u00108\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00088\u0010\'J\u0010\u00109\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010\'J\u0010\u0010:\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010$J\u0010\u0010;\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010$J\u0010\u0010<\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010$J\u0010\u0010=\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010-J\u0080\u0002\u0010>\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008>\u0010?J\u0010\u0010@\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010$J\u0010\u0010A\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008A\u0010\'J\u001a\u0010C\u001a\u00020\u000b2\u0008\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008C\u0010DJ\'\u0010M\u001a\u00020J2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010I\u001a\u00020HH\u0001\u00a2\u0006\u0004\u0008K\u0010LR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010N\u0012\u0004\u0008P\u0010Q\u001a\u0004\u0008O\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010N\u0012\u0004\u0008S\u0010Q\u001a\u0004\u0008R\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010T\u001a\u0004\u0008U\u0010\'R\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010T\u001a\u0004\u0008V\u0010\'R \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010N\u0012\u0004\u0008X\u0010Q\u001a\u0004\u0008W\u0010$R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010N\u0012\u0004\u0008Z\u0010Q\u001a\u0004\u0008Y\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010N\u001a\u0004\u0008[\u0010$R \u0010\u000c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\\\u0012\u0004\u0008]\u0010Q\u001a\u0004\u0008\u000c\u0010-R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010N\u0012\u0004\u0008_\u0010Q\u001a\u0004\u0008^\u0010$R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010N\u0012\u0004\u0008a\u0010Q\u001a\u0004\u0008`\u0010$R\u0017\u0010\u000f\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010T\u001a\u0004\u0008b\u0010\'R\u0017\u0010\u0010\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010T\u001a\u0004\u0008c\u0010\'R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010N\u0012\u0004\u0008e\u0010Q\u001a\u0004\u0008d\u0010$R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010N\u0012\u0004\u0008g\u0010Q\u001a\u0004\u0008f\u0010$R\u0017\u0010\u0013\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010N\u001a\u0004\u0008h\u0010$R \u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\\\u0012\u0004\u0008i\u0010Q\u001a\u0004\u0008\u0014\u0010-R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010N\u0012\u0004\u0008k\u0010Q\u001a\u0004\u0008j\u0010$R \u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010N\u0012\u0004\u0008m\u0010Q\u001a\u0004\u0008l\u0010$R \u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010T\u0012\u0004\u0008o\u0010Q\u001a\u0004\u0008n\u0010\'R \u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010T\u0012\u0004\u0008q\u0010Q\u001a\u0004\u0008p\u0010\'R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010N\u0012\u0004\u0008s\u0010Q\u001a\u0004\u0008r\u0010$R \u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010N\u0012\u0004\u0008u\u0010Q\u001a\u0004\u0008t\u0010$R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010N\u0012\u0004\u0008w\u0010Q\u001a\u0004\u0008v\u0010$R \u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\\\u0012\u0004\u0008x\u0010Q\u001a\u0004\u0008\u001c\u0010-\u00a8\u0006{"
    }
    d2 = {
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
        "",
        "",
        "systolicLabel",
        "systolicSuffix",
        "",
        "systolicMax",
        "systolicMin",
        "systolicTooHighLabel",
        "systolicTooLowLabel",
        "systolicRequiredText",
        "",
        "isSystolicRequired",
        "diastolicLabel",
        "diastolicSuffix",
        "diastolicMax",
        "diastolicMin",
        "diastolicTooHighLabel",
        "diastolicTooLowLabel",
        "diastolicRequiredText",
        "isDiastolicRequired",
        "hrLabel",
        "hrSuffix",
        "hrMax",
        "hrMin",
        "hrTooHighLabel",
        "hrTooLowLabel",
        "hrRequiredText",
        "isHrRequired",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "()Z",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;",
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
        "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getSystolicLabel",
        "getSystolicLabel$annotations",
        "()V",
        "getSystolicSuffix",
        "getSystolicSuffix$annotations",
        "I",
        "getSystolicMax",
        "getSystolicMin",
        "getSystolicTooHighLabel",
        "getSystolicTooHighLabel$annotations",
        "getSystolicTooLowLabel",
        "getSystolicTooLowLabel$annotations",
        "getSystolicRequiredText",
        "Z",
        "isSystolicRequired$annotations",
        "getDiastolicLabel",
        "getDiastolicLabel$annotations",
        "getDiastolicSuffix",
        "getDiastolicSuffix$annotations",
        "getDiastolicMax",
        "getDiastolicMin",
        "getDiastolicTooHighLabel",
        "getDiastolicTooHighLabel$annotations",
        "getDiastolicTooLowLabel",
        "getDiastolicTooLowLabel$annotations",
        "getDiastolicRequiredText",
        "isDiastolicRequired$annotations",
        "getHrLabel",
        "getHrLabel$annotations",
        "getHrSuffix",
        "getHrSuffix$annotations",
        "getHrMax",
        "getHrMax$annotations",
        "getHrMin",
        "getHrMin$annotations",
        "getHrTooHighLabel",
        "getHrTooHighLabel$annotations",
        "getHrTooLowLabel",
        "getHrTooLowLabel$annotations",
        "getHrRequiredText",
        "getHrRequiredText$annotations",
        "isHrRequired$annotations",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;


# instance fields
.field private final diastolicLabel:Ljava/lang/String;

.field private final diastolicMax:I

.field private final diastolicMin:I

.field private final diastolicRequiredText:Ljava/lang/String;

.field private final diastolicSuffix:Ljava/lang/String;

.field private final diastolicTooHighLabel:Ljava/lang/String;

.field private final diastolicTooLowLabel:Ljava/lang/String;

.field private final hrLabel:Ljava/lang/String;

.field private final hrMax:I

.field private final hrMin:I

.field private final hrRequiredText:Ljava/lang/String;

.field private final hrSuffix:Ljava/lang/String;

.field private final hrTooHighLabel:Ljava/lang/String;

.field private final hrTooLowLabel:Ljava/lang/String;

.field private final isDiastolicRequired:Z

.field private final isHrRequired:Z

.field private final isSystolicRequired:Z

.field private final systolicLabel:Ljava/lang/String;

.field private final systolicMax:I

.field private final systolicMin:I

.field private final systolicRequiredText:Ljava/lang/String;

.field private final systolicSuffix:Ljava/lang/String;

.field private final systolicTooHighLabel:Ljava/lang/String;

.field private final systolicTooLowLabel:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->Companion:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->INSTANCE:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    iput p5, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    iput-object p6, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    iput-boolean p9, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    iput-object p10, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    iput p12, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    iput p13, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    move/from16 p1, p17

    iput-boolean p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    move/from16 p1, p20

    iput p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    move/from16 p1, p21

    iput p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    move-object/from16 p1, p24

    iput-object p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    move/from16 p1, p25

    iput-boolean p1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p13

    move-object/from16 v9, p14

    move-object/from16 v10, p15

    move-object/from16 v11, p17

    move-object/from16 v12, p18

    move-object/from16 v13, p21

    move-object/from16 v14, p22

    move-object/from16 v15, p23

    const-string v0, "systolicLabel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicSuffix"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicTooHighLabel"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicTooLowLabel"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicRequiredText"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicLabel"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicSuffix"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicTooHighLabel"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicTooLowLabel"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicRequiredText"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrLabel"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrSuffix"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrTooHighLabel"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrTooLowLabel"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrRequiredText"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 3
    iput-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    .line 4
    iput-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    move/from16 v1, p3

    .line 5
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    move/from16 v1, p4

    .line 6
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    .line 7
    iput-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    .line 8
    iput-object v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    .line 9
    iput-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    move/from16 v1, p8

    .line 10
    iput-boolean v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    .line 11
    iput-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    .line 12
    iput-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    move/from16 v1, p11

    .line 13
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    move/from16 v1, p12

    .line 14
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    .line 15
    iput-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    .line 16
    iput-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    .line 17
    iput-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    move/from16 v1, p16

    .line 18
    iput-boolean v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    .line 19
    iput-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    .line 20
    iput-object v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    move/from16 v1, p19

    .line 21
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    move/from16 v1, p20

    .line 22
    iput v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    .line 23
    iput-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    .line 24
    iput-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    .line 25
    iput-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    move/from16 v1, p24

    .line 26
    iput-boolean v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p25

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-boolean v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p25, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p25, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p25, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    goto :goto_12

    :cond_12
    move/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p25, v16

    move/from16 p5, v1

    if-eqz v16, :cond_13

    iget v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    goto :goto_13

    :cond_13
    move/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p25, v16

    move/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p25, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p25, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p25, v16

    if-eqz v16, :cond_17

    move-object/from16 p9, v1

    iget-boolean v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    move-object/from16 p24, p9

    move/from16 p25, v1

    :goto_17
    move/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move/from16 p20, p5

    move/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_18

    :cond_17
    move/from16 p25, p24

    move-object/from16 p24, v1

    goto :goto_17

    :goto_18
    invoke-virtual/range {p1 .. p25}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->copy(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getDiastolicLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "diastolic_label_text"
    .end annotation

    return-void
.end method

.method public static synthetic getDiastolicSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "diastolic_suffix_text"
    .end annotation

    return-void
.end method

.method public static synthetic getDiastolicTooHighLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "diastolic_too_high_text"
    .end annotation

    return-void
.end method

.method public static synthetic getDiastolicTooLowLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "diastolic_too_low_text"
    .end annotation

    return-void
.end method

.method public static synthetic getHrLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_label_text"
    .end annotation

    return-void
.end method

.method public static synthetic getHrMax$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_max"
    .end annotation

    return-void
.end method

.method public static synthetic getHrMin$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_min"
    .end annotation

    return-void
.end method

.method public static synthetic getHrRequiredText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_required_text"
    .end annotation

    return-void
.end method

.method public static synthetic getHrSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_suffix_text"
    .end annotation

    return-void
.end method

.method public static synthetic getHrTooHighLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_too_high_text"
    .end annotation

    return-void
.end method

.method public static synthetic getHrTooLowLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_too_low_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSystolicLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "systolic_label_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSystolicSuffix$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "systolic_suffix_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSystolicTooHighLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "systolic_too_high_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSystolicTooLowLabel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "systolic_too_low_text"
    .end annotation

    return-void
.end method

.method public static synthetic isDiastolicRequired$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "diastolic_required"
    .end annotation

    return-void
.end method

.method public static synthetic isHrRequired$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "heart_rate_required"
    .end annotation

    return-void
.end method

.method public static synthetic isSystolicRequired$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "systolic_required"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$whooplabs_release(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x5

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x6

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x7

    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x8

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x9

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xa

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0xb

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0xc

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xd

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xe

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0xf

    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v0, 0x10

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x11

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x12

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0x13

    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/16 v0, 0x14

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x15

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x16

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v0, 0x17

    iget-boolean p0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    return v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    return v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component24()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    return v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;
    .locals 26

    const-string v0, "systolicLabel"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicSuffix"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicTooHighLabel"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicTooLowLabel"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "systolicRequiredText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicLabel"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicSuffix"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicTooHighLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicTooLowLabel"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diastolicRequiredText"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrLabel"

    move-object/from16 v4, p17

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrSuffix"

    move-object/from16 v5, p18

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrTooHighLabel"

    move-object/from16 v9, p21

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrTooLowLabel"

    move-object/from16 v12, p22

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrRequiredText"

    move-object/from16 v13, p23

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v25, p24

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v22, v9

    move-object/from16 v23, v12

    move-object/from16 v24, v13

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v9, p8

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v25}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    iget-boolean v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    iget v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    iget-boolean p1, p1, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    if-eq v1, p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getDiastolicLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    return v0
.end method

.method public final getDiastolicMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    return v0
.end method

.method public final getDiastolicRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicTooHighLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getDiastolicTooLowLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    return v0
.end method

.method public final getHrMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    return v0
.end method

.method public final getHrRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrTooHighLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getHrTooLowLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicMax()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    return v0
.end method

.method public final getSystolicMin()I
    .locals 1

    iget v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    return v0
.end method

.method public final getSystolicRequiredText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicSuffix()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicTooHighLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getSystolicTooLowLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isDiastolicRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    return v0
.end method

.method public final isHrRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    return v0
.end method

.method public final isSystolicRequired()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicLabel:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicSuffix:Ljava/lang/String;

    iget v3, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMax:I

    iget v4, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicMin:I

    iget-object v5, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooHighLabel:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicTooLowLabel:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->systolicRequiredText:Ljava/lang/String;

    iget-boolean v8, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired:Z

    iget-object v9, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicLabel:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicSuffix:Ljava/lang/String;

    iget v11, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMax:I

    iget v12, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicMin:I

    iget-object v13, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooHighLabel:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicTooLowLabel:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->diastolicRequiredText:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired:Z

    move/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrLabel:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrSuffix:Ljava/lang/String;

    move-object/from16 v19, v15

    iget v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMax:I

    move/from16 v20, v15

    iget v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrMin:I

    move/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooHighLabel:Ljava/lang/String;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrTooLowLabel:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->hrRequiredText:Ljava/lang/String;

    move-object/from16 v24, v15

    iget-boolean v15, v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired:Z

    const-string v0, ", systolicSuffix="

    move/from16 v25, v15

    const-string v15, ", systolicMax="

    move-object/from16 v26, v13

    const-string v13, "MysticResponse(systolicLabel="

    invoke-static {v13, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", systolicMin="

    const-string v2, ", systolicTooHighLabel="

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", systolicTooLowLabel="

    const-string v2, ", systolicRequiredText="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isSystolicRequired="

    const-string v2, ", diastolicLabel="

    invoke-static {v0, v7, v1, v8, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", diastolicSuffix="

    const-string v2, ", diastolicMax="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", diastolicMin="

    const-string v2, ", diastolicTooHighLabel="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", diastolicTooLowLabel="

    const-string v2, ", diastolicRequiredText="

    move-object/from16 v3, v26

    invoke-static {v0, v3, v1, v14, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isDiastolicRequired="

    const-string v2, ", hrLabel="

    move-object/from16 v3, v16

    move/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", hrSuffix="

    const-string v2, ", hrMax="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", hrMin="

    const-string v2, ", hrTooHighLabel="

    move/from16 v3, v20

    move/from16 v4, v21

    invoke-static {v0, v3, v1, v4, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", hrTooLowLabel="

    const-string v2, ", hrRequiredText="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isHrRequired="

    const-string v2, ")"

    move-object/from16 v3, v24

    move/from16 v4, v25

    invoke-static {v0, v3, v1, v4, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
