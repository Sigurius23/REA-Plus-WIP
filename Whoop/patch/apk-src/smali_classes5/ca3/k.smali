.class public final Lca3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lca3/k;

.field public static final b:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lca3/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lca3/k;->a:Lca3/k;

    sget-object v0, Lca3/j;->w:Lca3/j;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lca3/k;->b:Ll83/p;

    return-void
.end method

.method public static a()Ljava/util/List;
    .locals 1

    sget-object v0, Lca3/k;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
