.class public abstract Lwc/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lbg/h;

    const/16 v1, -0x57

    const/4 v2, -0x2

    const/16 v3, -0x56

    const/4 v4, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lbg/h;-><init>(BBBB)V

    new-instance v5, Lbg/h;

    const/16 v6, 0x17

    invoke-direct {v5, v1, v2, v3, v6}, Lbg/h;-><init>(BBBB)V

    new-instance v7, Lbg/k;

    const/4 v14, 0x0

    const/16 v15, 0x23

    const/16 v8, -0x300

    const/16 v9, 0xec2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v16}, Lbg/k;-><init>(SSSSSSSSLjava/lang/String;)V

    const/4 v1, 0x5

    new-array v1, v1, [Landroidx/room/c1;

    sget-object v2, Lbg/h;->b:Lbg/h;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lbg/k;->e:Lbg/k;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    aput-object v0, v1, v4

    const/4 v0, 0x3

    aput-object v5, v1, v0

    const/4 v0, 0x4

    aput-object v7, v1, v0

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lwc/j;->a:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lwc/j;->a:Ljava/util/Set;

    return-object v0
.end method
