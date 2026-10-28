.class public Leg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljc/b0;

.field public b:I

.field public final c:Ljc/b0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljc/b0;

    new-instance v1, Ldc1/c;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    sget-object v2, Lfg/k;->c:Lqt/e;

    invoke-direct {v0, v2, v1}, Ljc/b0;-><init>(Lvg/g;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Leg/k;->a:Ljc/b0;

    const/4 v0, 0x3

    iput v0, p0, Leg/k;->b:I

    new-instance v0, Ljc/b0;

    new-instance v1, Ldc1/c;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Ldc1/c;-><init>(I)V

    sget-object v2, Lfg/u;->f:Lio/sentry/hints/j;

    invoke-direct {v0, v2, v1}, Ljc/b0;-><init>(Lvg/g;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Leg/k;->c:Ljc/b0;

    return-void
.end method
