.class public final Ll30/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll30/j;

    sget-object v1, Ll30/j;->c:Ll30/o;

    invoke-direct {v0, v1}, Ll30/m;-><init>(Ll30/o;)V

    new-instance v1, Ll30/k;

    sget-object v2, Ll30/k;->b:Ll30/o;

    invoke-direct {v1, v2}, Ll30/m;-><init>(Ll30/o;)V

    new-instance v2, Ll30/i;

    sget-object v3, Ll30/i;->b:Ll30/o;

    invoke-direct {v2, v3}, Ll30/m;-><init>(Ll30/o;)V

    new-instance v3, Ll30/h;

    invoke-direct {v3}, Ll30/h;-><init>()V

    new-instance v4, Ll30/l;

    sget-object v5, Ll30/l;->b:Ll30/o;

    invoke-direct {v4, v5}, Ll30/m;-><init>(Ll30/o;)V

    const/4 v5, 0x5

    new-array v5, v5, [Ll30/m;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v3, v5, v0

    const/4 v0, 0x4

    aput-object v4, v5, v0

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll30/c;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, "securityChecks"

    sget-object v1, Ll30/c;->b:Ljava/util/List;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ll30/c;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 4

    iget-object v0, p0, Ll30/c;->a:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll30/m;

    invoke-virtual {v3}, Ll30/m;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll30/m;

    iget-object v2, v2, Ll30/m;->a:Ll30/o;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method
