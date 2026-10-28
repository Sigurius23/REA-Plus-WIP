.class public final Leg/b;
.super Lae3/k;
.source "SourceFile"


# instance fields
.field public final e:Lfg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leg/b;

    new-instance v1, Leg/a;

    invoke-direct {v1}, Leg/a;-><init>()V

    invoke-direct {v0, v1}, Leg/b;-><init>(Leg/a;)V

    return-void
.end method

.method public constructor <init>(Leg/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lae3/k;-><init>(Leg/k;)V

    iget-object p1, p1, Leg/a;->d:Ljc/b0;

    iget-object p1, p1, Ljc/b0;->g:Ljava/lang/Object;

    check-cast p1, Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfg/m;

    iput-object p1, p0, Leg/b;->e:Lfg/m;

    return-void
.end method
