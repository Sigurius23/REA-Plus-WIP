.class public final Leg/a;
.super Leg/k;
.source "SourceFile"


# instance fields
.field public final d:Ljc/b0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Leg/k;-><init>()V

    new-instance v0, Ljc/b0;

    new-instance v1, Le81/e;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Le81/e;-><init>(I)V

    sget-object v2, Lfg/e;->j:Lkr/e;

    invoke-direct {v0, v2, v1}, Ljc/b0;-><init>(Lvg/g;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Leg/a;->d:Ljc/b0;

    return-void
.end method
