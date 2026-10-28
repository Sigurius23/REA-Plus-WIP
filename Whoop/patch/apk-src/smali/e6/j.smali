.class public abstract Le6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Le6/j;->a:Ljava/util/LinkedHashSet;

    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)Ld6/b;
    .locals 10

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le6/j;->a:Ljava/util/LinkedHashSet;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    new-instance v3, Ld6/b;

    new-instance v7, La6/q;

    const/4 v0, 0x6

    invoke-direct {v7, p1, v2, v0}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v8, Le6/i;

    invoke-direct {v8, v1, v2}, Ls83/i;-><init>(ILq83/d;)V

    sget-object v6, Ld6/c;->a:Ljava/util/LinkedHashSet;

    move-object v4, p0

    move-object v5, p2

    invoke-direct/range {v3 .. v8}, Ld6/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;La6/q;Le6/i;)V

    return-object v3

    :cond_0
    move-object v4, p0

    move-object v5, p2

    new-instance p0, Ld6/b;

    new-instance v8, La6/q;

    const/4 p2, 0x6

    invoke-direct {v8, p1, v2, p2}, La6/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v9, Le6/i;

    invoke-direct {v9, v1, v2}, Ls83/i;-><init>(ILq83/d;)V

    move-object v7, p1

    move-object v6, v5

    move-object v5, v4

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, Ld6/b;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;La6/q;Le6/i;)V

    return-object v4
.end method
