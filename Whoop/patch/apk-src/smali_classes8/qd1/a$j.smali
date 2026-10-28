.class final Lqd1/a$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqd1/a;->f(Lfj0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.domain.converters.UserSessionManagerImpl"
    f = "UserSessionManagerImpl.kt"
    l = {
        0x4b,
        0x51,
        0x54
    }
    m = "postLoginMissionCriticalFetches"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lqd1/a;


# direct methods
.method public constructor <init>(Lqd1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqd1/a;",
            "Lq83/d<",
            "-",
            "Lqd1/a$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqd1/a$j;->z:Lqd1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqd1/a$j;->y:Ljava/lang/Object;

    iget p1, p0, Lqd1/a$j;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqd1/a$j;->E:I

    iget-object p1, p0, Lqd1/a$j;->z:Lqd1/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqd1/a;->f(Lfj0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
