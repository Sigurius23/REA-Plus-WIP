.class public final Lkd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyd/c;
.implements Lnf/h;
.implements Lcf/f;
.implements Lcf/j;
.implements Lmg/e;


# instance fields
.field public final synthetic a:Lzt/q;

.field public final synthetic b:Lcf/h;

.field public final c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/util/List;

.field public final f:Lm83/y;

.field public g:Lcg/o;

.field public final h:Ljava/util/ArrayList;

.field public i:Lcf/e;

.field public j:Lmg/h;

.field public k:Ljava/lang/Boolean;

.field public l:Ljava/lang/Boolean;

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzt/q;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lzt/q;-><init>(I)V

    iput-object v0, p0, Lkd/e;->a:Lzt/q;

    new-instance v0, Lcf/h;

    invoke-direct {v0}, Lcf/h;-><init>()V

    iput-object v0, p0, Lkd/e;->b:Lcf/h;

    const-string v0, "SSO OIDC"

    iput-object v0, p0, Lkd/e;->c:Ljava/lang/String;

    sget-object v0, Lm83/y;->w:Lm83/y;

    iput-object v0, p0, Lkd/e;->f:Lm83/y;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkd/e;->h:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Lff/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lkd/e;->l:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final build()Ljava/lang/Object;
    .locals 1

    new-instance v0, Lkd/g;

    invoke-direct {v0, p0}, Lkd/g;-><init>(Lkd/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->l:Ljava/lang/Boolean;

    return-void
.end method

.method public final d(Lcf/e;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->i:Lcf/e;

    return-void
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lkd/e;->k:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->m:Ljava/lang/String;

    return-void
.end method

.method public final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lkd/e;->e:Ljava/util/List;

    return-object v0
.end method

.method public final h(Leg/o;)V
    .locals 1

    iget-object v0, p0, Lkd/e;->b:Lcf/h;

    invoke-virtual {v0, p1}, Lcf/h;->h(Leg/o;)V

    return-void
.end method

.method public final i(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->k:Ljava/lang/Boolean;

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->d:Ljava/lang/String;

    return-void
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkd/e;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Lmg/h;
    .locals 1

    iget-object v0, p0, Lkd/e;->j:Lmg/h;

    return-object v0
.end method

.method public final m(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lkd/e;->e:Ljava/util/List;

    return-void
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkd/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Lcf/e;
    .locals 1

    iget-object v0, p0, Lkd/e;->i:Lcf/e;

    return-object v0
.end method
