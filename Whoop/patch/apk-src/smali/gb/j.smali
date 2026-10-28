.class public final Lgb/j;
.super Leb/o0;
.source "SourceFile"


# instance fields
.field public final f:Lgb/i;

.field public final g:Lx1/b;

.field public h:Lkotlin/jvm/functions/Function1;

.field public i:Lkotlin/jvm/functions/Function1;

.field public j:Lkotlin/jvm/functions/Function1;

.field public k:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lgb/i;Ljava/lang/String;Lx1/b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Leb/o0;-><init>(Leb/i1;Ljava/lang/String;)V

    iput-object p1, p0, Lgb/j;->f:Lgb/i;

    iput-object p3, p0, Lgb/j;->g:Lx1/b;

    return-void
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 2

    invoke-super {p0}, Leb/o0;->a()Leb/n0;

    move-result-object v0

    check-cast v0, Lgb/h;

    iget-object v1, p0, Lgb/j;->h:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Lgb/h;->M:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgb/j;->i:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Lgb/h;->N:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgb/j;->j:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Lgb/h;->O:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lgb/j;->k:Lkotlin/jvm/functions/Function1;

    iput-object v1, v0, Lgb/h;->P:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final b()Leb/n0;
    .locals 3

    new-instance v0, Lgb/h;

    iget-object v1, p0, Lgb/j;->f:Lgb/i;

    iget-object v2, p0, Lgb/j;->g:Lx1/b;

    invoke-direct {v0, v1, v2}, Lgb/h;-><init>(Lgb/i;Lx1/b;)V

    return-object v0
.end method
