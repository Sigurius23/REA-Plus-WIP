.class public final Ld33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lec3/h2;


# direct methods
.method public constructor <init>(Lec3/f2;Lec3/f2;)V
    .locals 1

    const-string v0, "activeCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ringingCall"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    .line 3
    iput-object p1, p0, Ld33/c;->a:Lec3/h2;

    return-void
.end method

.method public constructor <init>(Lio/getstream/video/android/model/User;)V
    .locals 1

    const-string v0, "initial"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ld33/c;->a:Lec3/h2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lz23/c;Lso/q;La30/w0;)V
    .locals 0

    const-string p1, "callType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "myParticipantState"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "clientEventReporter"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p1, ""

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Ld33/c;->a:Lec3/h2;

    return-void
.end method


# virtual methods
.method public a()Lio/getstream/video/android/model/User;
    .locals 1

    iget-object v0, p0, Ld33/c;->a:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/video/android/model/User;

    return-object v0
.end method
