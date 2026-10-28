.class final Lrj1/b$a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrj1/b$a;->a(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lm7/r0;",
        ">",
        "Ls83/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthconnect.utils.HealthConnectRecordsUtils$Companion"
    f = "HealthConnectRecordsUtils.kt"
    l = {
        0x16
    }
    m = "splitAndSendRecordsAndDeletions"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lrj1/b$a;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lrj1/b$a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj1/b$a;",
            "Lq83/d<",
            "-",
            "Lrj1/b$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrj1/b$a$a;->I:Lrj1/b$a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lrj1/b$a$a;->H:Ljava/lang/Object;

    iget p1, p0, Lrj1/b$a$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrj1/b$a$a;->J:I

    iget-object v0, p0, Lrj1/b$a$a;->I:Lrj1/b$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lrj1/b$a;->a(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
