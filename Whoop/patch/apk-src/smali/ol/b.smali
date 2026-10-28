.class public final Lol/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/f;


# instance fields
.field public final w:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lol/b;->w:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lol/b;->w:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public k0()Lti/d;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lol/b;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lej/a;

    invoke-virtual {v0}, Lej/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lti/i;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lti/i;-><init>(Ljava/util/List;I)V

    return-object v0

    :cond_0
    new-instance v0, Lti/l;

    invoke-direct {v0, v1}, Lti/l;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public m0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lol/b;->w:Ljava/util/ArrayList;

    return-object v0
.end method

.method public p0()Z
    .locals 4

    iget-object v0, p0, Lol/b;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lej/a;

    invoke-virtual {v0}, Lej/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return v3

    :cond_0
    return v2
.end method
