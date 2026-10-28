.class public final Lcom/whoop/ui/teams/LeadersEntryDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;,
        Lcom/whoop/ui/teams/LeadersEntryDto$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008+\u0008\u0087\u0008\u0018\u0000 y2\u00020\u0001:\u0002z{B\u008d\u0002\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u001fB\u00f9\u0001\u0008\u0010\u0012\u0006\u0010 \u001a\u00020\u0004\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\"\u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u001e\u0010#J\r\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00082\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00083\u00101J\u0012\u00104\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00084\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00085\u00101J\u0012\u00106\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00086\u00101J\u0012\u00107\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00087\u00101J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00088\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010(J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010(J\u0012\u0010>\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u0010(J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u0010(J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010(J\u0012\u0010A\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008A\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008C\u0010BJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010BJ\u009a\u0002\u0010E\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0010\u0008\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008E\u0010FJ\u0010\u0010G\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008G\u0010(J\u0010\u0010H\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008H\u0010*J\u001a\u0010J\u001a\u00020\u00082\u0008\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008J\u0010KJ\'\u0010T\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00002\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020OH\u0001\u00a2\u0006\u0004\u0008R\u0010SR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010U\u001a\u0004\u0008V\u0010(R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010W\u0012\u0004\u0008Y\u0010Z\u001a\u0004\u0008X\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010U\u001a\u0004\u0008[\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\\\u001a\u0004\u0008]\u0010-R\u001a\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010^\u001a\u0004\u0008_\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010`\u001a\u0004\u0008a\u00101R\u001c\u0010\u000c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010`\u001a\u0004\u0008b\u00101R\"\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010`\u0012\u0004\u0008d\u0010Z\u001a\u0004\u0008c\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010`\u001a\u0004\u0008e\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010`\u001a\u0004\u0008f\u00101R\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010`\u0012\u0004\u0008h\u0010Z\u001a\u0004\u0008g\u00101R\"\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010`\u0012\u0004\u0008j\u0010Z\u001a\u0004\u0008i\u00101R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010k\u001a\u0004\u0008l\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010m\u001a\u0004\u0008n\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010U\u001a\u0004\u0008o\u0010(R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010U\u001a\u0004\u0008p\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010U\u001a\u0004\u0008q\u0010(R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010U\u001a\u0004\u0008r\u0010(R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010U\u001a\u0004\u0008s\u0010(R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010t\u0012\u0004\u0008v\u0010Z\u001a\u0004\u0008u\u0010BR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010t\u001a\u0004\u0008w\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010t\u001a\u0004\u0008x\u0010B\u00a8\u0006|"
    }
    d2 = {
        "Lcom/whoop/ui/teams/LeadersEntryDto;",
        "",
        "",
        "name",
        "",
        "id",
        "avatarUrl",
        "rank",
        "",
        "deleted",
        "",
        "dayStrain",
        "calories",
        "recoveryScore",
        "hrv",
        "rhr",
        "sleepDuration",
        "sleepPerformance",
        "",
        "Lcom/whoop/ui/teams/LeaderActivityDto;",
        "activities",
        "peakActivity",
        "createdAt",
        "updatedAt",
        "cycleDayJoined",
        "period",
        "during",
        "waitingForData",
        "compliant",
        "hasData",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/domain/model/teams/LeadersEntry;",
        "toLeadersEntry",
        "()Lcom/whoop/domain/model/teams/LeadersEntry;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()I",
        "component3",
        "component4",
        "()Ljava/lang/Integer;",
        "component5",
        "()Z",
        "component6",
        "()Ljava/lang/Double;",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "()Ljava/util/List;",
        "component14",
        "()Lcom/whoop/ui/teams/LeaderActivityDto;",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "()Ljava/lang/Boolean;",
        "component21",
        "component22",
        "copy",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/ui/teams/LeadersEntryDto;",
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
        "write$Self$core_release",
        "(Lcom/whoop/ui/teams/LeadersEntryDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getName",
        "I",
        "getId",
        "getId$annotations",
        "()V",
        "getAvatarUrl",
        "Ljava/lang/Integer;",
        "getRank",
        "Z",
        "getDeleted",
        "Ljava/lang/Double;",
        "getDayStrain",
        "getCalories",
        "getRecoveryScore",
        "getRecoveryScore$annotations",
        "getHrv",
        "getRhr",
        "getSleepDuration",
        "getSleepDuration$annotations",
        "getSleepPerformance",
        "getSleepPerformance$annotations",
        "Ljava/util/List;",
        "getActivities",
        "Lcom/whoop/ui/teams/LeaderActivityDto;",
        "getPeakActivity",
        "getCreatedAt",
        "getUpdatedAt",
        "getCycleDayJoined",
        "getPeriod",
        "getDuring",
        "Ljava/lang/Boolean;",
        "getWaitingForData",
        "getWaitingForData$annotations",
        "getCompliant",
        "getHasData",
        "Companion",
        "$serializer",
        "a",
        "core_release"
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

.field public static final Companion:Lcom/whoop/ui/teams/LeadersEntryDto$a;


# instance fields
.field private final activities:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "activities"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation
.end field

.field private final avatarUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avatar_url"
    .end annotation
.end field

.field private final calories:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "calories"
    .end annotation
.end field

.field private final compliant:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "compliant"
    .end annotation
.end field

.field private final createdAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final cycleDayJoined:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cycle_day_joined"
    .end annotation
.end field

.field private final dayStrain:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_strain"
    .end annotation
.end field

.field private final deleted:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "deleted"
    .end annotation
.end field

.field private final during:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "during"
    .end annotation
.end field

.field private final hasData:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "has_data"
    .end annotation
.end field

.field private final hrv:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hrv"
    .end annotation
.end field

.field private final id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peak_activity"
    .end annotation
.end field

.field private final period:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "period"
    .end annotation
.end field

.field private final rank:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rank"
    .end annotation
.end field

.field private final recoveryScore:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score"
    .end annotation
.end field

.field private final rhr:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "rhr"
    .end annotation
.end field

.field private final sleepDuration:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "duration"
    .end annotation
.end field

.field private final sleepPerformance:Ljava/lang/Double;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "performance"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final waitingForData:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_waiting_for_data"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/ui/teams/LeadersEntryDto$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/teams/LeadersEntryDto$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/teams/LeadersEntryDto;->Companion:Lcom/whoop/ui/teams/LeadersEntryDto$a;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lhb1/l;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Lhb1/l;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x16

    new-array v2, v2, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v2, v4

    const/4 v4, 0x1

    aput-object v1, v2, v4

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    const/4 v4, 0x4

    aput-object v1, v2, v4

    const/4 v4, 0x5

    aput-object v1, v2, v4

    const/4 v4, 0x6

    aput-object v1, v2, v4

    const/4 v4, 0x7

    aput-object v1, v2, v4

    const/16 v4, 0x8

    aput-object v1, v2, v4

    const/16 v4, 0x9

    aput-object v1, v2, v4

    const/16 v4, 0xa

    aput-object v1, v2, v4

    const/16 v4, 0xb

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    const/16 v0, 0xd

    aput-object v1, v2, v0

    const/16 v0, 0xe

    aput-object v1, v2, v0

    const/16 v0, 0xf

    aput-object v1, v2, v0

    const/16 v0, 0x10

    aput-object v1, v2, v0

    const/16 v0, 0x11

    aput-object v1, v2, v0

    const/16 v0, 0x12

    aput-object v1, v2, v0

    const/16 v0, 0x13

    aput-object v1, v2, v0

    const/16 v0, 0x14

    aput-object v1, v2, v0

    const/16 v0, 0x15

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/ui/teams/LeadersEntryDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x12

    const/16 v1, 0x12

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;

    invoke-virtual {v0}, Lcom/whoop/ui/teams/LeadersEntryDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    :goto_0
    iput p3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    :goto_2
    iput-boolean p6, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_4

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    :goto_3
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_5

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    goto :goto_4

    :cond_5
    iput-object p8, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    :goto_4
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_6

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    goto :goto_5

    :cond_6
    iput-object p9, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    :goto_5
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_7

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    goto :goto_6

    :cond_7
    iput-object p10, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    :goto_6
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_8

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    goto :goto_7

    :cond_8
    iput-object p11, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    :goto_7
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_9

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    goto :goto_8

    :cond_9
    iput-object p12, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    :goto_8
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_a

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    goto :goto_9

    :cond_a
    iput-object p13, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    :goto_9
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_b

    .line 2
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 3
    :goto_a
    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    goto :goto_b

    :cond_b
    move-object/from16 p2, p14

    goto :goto_a

    :goto_b
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_c

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    goto :goto_c

    :cond_c
    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    :goto_c
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_d

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    :goto_d
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_e

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    :goto_e
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    :goto_f
    const/high16 p2, 0x20000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    :goto_10
    const/high16 p2, 0x40000

    and-int/2addr p2, p1

    if-nez p2, :cond_11

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    :goto_11
    const/high16 p2, 0x80000

    and-int/2addr p2, p1

    if-nez p2, :cond_12

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    goto :goto_12

    :cond_12
    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    :goto_12
    const/high16 p2, 0x100000

    and-int/2addr p2, p1

    if-nez p2, :cond_13

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    :goto_13
    const/high16 p2, 0x200000

    and-int/2addr p1, p2

    if-nez p1, :cond_14

    iput-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    return-void

    :cond_14
    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Z",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    .line 6
    iput p2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    .line 7
    iput-object p3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    .line 8
    iput-object p4, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    .line 9
    iput-boolean p5, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    .line 10
    iput-object p6, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    .line 11
    iput-object p7, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    .line 12
    iput-object p8, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    .line 13
    iput-object p9, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    .line 14
    iput-object p10, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    .line 15
    iput-object p11, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    .line 16
    iput-object p12, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    .line 17
    iput-object p13, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    .line 18
    iput-object p14, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    .line 19
    iput-object p15, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 20
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 21
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 22
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 23
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 24
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 p1, p21

    .line 25
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    move-object/from16 p1, p22

    .line 26
    iput-object p1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v2

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move-object v14, v2

    goto :goto_8

    :cond_8
    move-object/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v16, v1

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    move-object/from16 v17, v2

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v18, v2

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v19, v2

    goto :goto_d

    :cond_d
    move-object/from16 v19, p16

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v20, v2

    goto :goto_e

    :cond_e
    move-object/from16 v20, p17

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v21, v2

    goto :goto_f

    :cond_f
    move-object/from16 v21, p18

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v22, v2

    goto :goto_10

    :cond_10
    move-object/from16 v22, p19

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v23, v2

    goto :goto_11

    :cond_11
    move-object/from16 v23, p20

    :goto_11
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move-object/from16 v24, v2

    goto :goto_12

    :cond_12
    move-object/from16 v24, p21

    :goto_12
    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-eqz v0, :cond_13

    move-object/from16 v25, v2

    :goto_13
    move-object/from16 v3, p0

    move/from16 v5, p2

    move/from16 v8, p5

    goto :goto_14

    :cond_13
    move-object/from16 v25, p22

    goto :goto_13

    .line 28
    :goto_14
    invoke-direct/range {v3 .. v25}, Lcom/whoop/ui/teams/LeadersEntryDto;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/ui/teams/LeadersEntryDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/ui/teams/LeadersEntryDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/ui/teams/LeadersEntryDto;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/lang/Object;)Lcom/whoop/ui/teams/LeadersEntryDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p23, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p23, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p23, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p23, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p23, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p23, v16

    if-eqz v16, :cond_15

    move-object/from16 p7, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    move-object/from16 p22, p7

    move-object/from16 p23, v1

    :goto_15
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p16, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_16

    :cond_15
    move-object/from16 p23, p22

    move-object/from16 p22, v1

    goto :goto_15

    :goto_16
    invoke-virtual/range {p1 .. p23}, Lcom/whoop/ui/teams/LeadersEntryDto;->copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/ui/teams/LeadersEntryDto;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getId$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "user_id"
    .end annotation

    return-void
.end method

.method public static synthetic getRecoveryScore$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "score"
    .end annotation

    return-void
.end method

.method public static synthetic getSleepDuration$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "duration"
    .end annotation

    return-void
.end method

.method public static synthetic getSleepPerformance$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "performance"
    .end annotation

    return-void
.end method

.method public static synthetic getWaitingForData$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_waiting_for_data"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/ui/teams/LeadersEntryDto;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/ui/teams/LeadersEntryDto;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    iget v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    iget-boolean v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    if-eqz v2, :cond_f

    :goto_7
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v1, 0xa

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    if-eqz v2, :cond_11

    :goto_8
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    if-eqz v2, :cond_13

    :goto_9
    sget-object v2, Lkotlinx/serialization/internal/DoubleSerializer;->INSTANCE:Lkotlinx/serialization/internal/DoubleSerializer;

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :goto_a
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    if-eqz v1, :cond_17

    :goto_b
    sget-object v1, Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;->INSTANCE:Lcom/whoop/ui/teams/LeaderActivityDto$$serializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    if-eqz v1, :cond_19

    :goto_c
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    if-eqz v1, :cond_1b

    :goto_d
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    if-eqz v1, :cond_1d

    :goto_e
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    if-eqz v1, :cond_1f

    :goto_f
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1f
    const/16 v0, 0x12

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_10

    :cond_20
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    if-eqz v1, :cond_21

    :goto_10
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_21
    const/16 v0, 0x13

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_22

    goto :goto_11

    :cond_22
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    if-eqz v1, :cond_23

    :goto_11
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_23
    const/16 v0, 0x14

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_24

    goto :goto_12

    :cond_24
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    if-eqz v1, :cond_25

    :goto_12
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_25
    const/16 v0, 0x15

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_13

    :cond_26
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    if-eqz v1, :cond_27

    :goto_13
    sget-object v1, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object p0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_27
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    return-object v0
.end method

.method public final component11()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    return-object v0
.end method

.method public final component12()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    return-object v0
.end method

.method public final component13()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    return-object v0
.end method

.method public final component14()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    return v0
.end method

.method public final component20()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component21()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component22()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    return v0
.end method

.method public final component6()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final component7()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    return-object v0
.end method

.method public final component8()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final component9()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/ui/teams/LeadersEntryDto;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Z",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")",
            "Lcom/whoop/ui/teams/LeadersEntryDto;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ui/teams/LeadersEntryDto;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move-object/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    move-object/from16 v20, p20

    move-object/from16 v21, p21

    move-object/from16 v22, p22

    invoke-direct/range {v0 .. v22}, Lcom/whoop/ui/teams/LeadersEntryDto;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ui/teams/LeadersEntryDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ui/teams/LeadersEntryDto;

    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    iget v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    iget-boolean v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    iget-object p1, p1, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    return v2

    :cond_17
    return v0
.end method

.method public final getActivities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/ui/teams/LeaderActivityDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    return-object v0
.end method

.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getCalories()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    return-object v0
.end method

.method public final getCompliant()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getCycleDayJoined()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayStrain()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    return-object v0
.end method

.method public final getDeleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    return v0
.end method

.method public final getDuring()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    return-object v0
.end method

.method public final getHasData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getHrv()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeakActivity()Lcom/whoop/ui/teams/LeaderActivityDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    return-object v0
.end method

.method public final getPeriod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    return-object v0
.end method

.method public final getRank()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getRecoveryScore()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    return-object v0
.end method

.method public final getRhr()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSleepDuration()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    return-object v0
.end method

.method public final getSleepPerformance()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getWaitingForData()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Lcom/whoop/ui/teams/LeaderActivityDto;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    if-nez v3, :cond_d

    move v3, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    if-nez v3, :cond_e

    move v3, v1

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_e
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    if-nez v3, :cond_f

    move v3, v1

    goto :goto_f

    :cond_f
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_f
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    if-nez v3, :cond_10

    move v3, v1

    goto :goto_10

    :cond_10
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_10
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    if-nez v3, :cond_11

    move v3, v1

    goto :goto_11

    :cond_11
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_11
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    if-nez v3, :cond_12

    move v3, v1

    goto :goto_12

    :cond_12
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_12
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    if-nez v2, :cond_13

    goto :goto_13

    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_13
    add-int/2addr v0, v1

    return v0
.end method

.method public final toLeadersEntry()Lcom/whoop/domain/model/teams/LeadersEntry;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v3, v1

    iget v4, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    iget-object v5, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    move v6, v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget-object v7, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    iget-object v9, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    iget-object v10, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    iget-object v11, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    iget-object v12, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    iget-object v13, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    iget-object v14, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    move-object v15, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    move-object/from16 v17, v2

    new-instance v2, Lcom/whoop/domain/model/teams/LeadersEntry;

    const v25, 0x40020

    const/16 v26, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    const/16 v21, 0x0

    move-object/from16 v24, v1

    invoke-direct/range {v2 .. v26}, Lcom/whoop/domain/model/teams/LeadersEntry;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/ui/teams/LeaderActivityDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->name:Ljava/lang/String;

    iget v2, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->id:I

    iget-object v3, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->avatarUrl:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rank:Ljava/lang/Integer;

    iget-boolean v5, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->deleted:Z

    iget-object v6, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->dayStrain:Ljava/lang/Double;

    iget-object v7, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->calories:Ljava/lang/Double;

    iget-object v8, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->recoveryScore:Ljava/lang/Double;

    iget-object v9, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hrv:Ljava/lang/Double;

    iget-object v10, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->rhr:Ljava/lang/Double;

    iget-object v11, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepDuration:Ljava/lang/Double;

    iget-object v12, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->sleepPerformance:Ljava/lang/Double;

    iget-object v13, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->activities:Ljava/util/List;

    iget-object v14, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->peakActivity:Lcom/whoop/ui/teams/LeaderActivityDto;

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->createdAt:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->updatedAt:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->cycleDayJoined:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->period:Ljava/lang/String;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->during:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->waitingForData:Ljava/lang/Boolean;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->compliant:Ljava/lang/Boolean;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/ui/teams/LeadersEntryDto;->hasData:Ljava/lang/Boolean;

    const-string v0, ", id="

    move-object/from16 v23, v15

    const-string v15, ", avatarUrl="

    move-object/from16 v24, v14

    const-string v14, "LeadersEntryDto(name="

    invoke-static {v2, v14, v1, v0, v15}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rank="

    const-string v2, ", deleted="

    invoke-static {v4, v3, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dayStrain="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", calories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryScore="

    const-string v2, ", hrv="

    invoke-static {v0, v7, v1, v8, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", rhr="

    const-string v2, ", sleepDuration="

    invoke-static {v0, v9, v1, v10, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    const-string v1, ", sleepPerformance="

    const-string v2, ", activities="

    invoke-static {v0, v11, v1, v12, v2}, Ljh3/c;->q(Ljava/lang/StringBuilder;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", peakActivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", cycleDayJoined="

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", period="

    const-string v2, ", during="

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", waitingForData="

    const-string v2, ", compliant="

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-static {v4, v3, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hasData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
