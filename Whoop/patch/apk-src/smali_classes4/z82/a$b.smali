.class final Lz82/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz82/a;->B(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
    c = "com.whoop.service.analytics.AmplitudeAnalyticsManager"
    f = "AmplitudeAnalyticsManager.kt"
    l = {
        0x1aa
    }
    m = "buildBaseTraits"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lz82/a;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lz82/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz82/a;",
            "Lq83/d<",
            "-",
            "Lz82/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lz82/a$b;->E:Lz82/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lz82/a$b;->z:Ljava/lang/Object;

    iget p1, p0, Lz82/a$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz82/a$b;->F:I

    iget-object p1, p0, Lz82/a$b;->E:Lz82/a;

    invoke-static {p1, p0}, Lz82/a;->o(Lz82/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
