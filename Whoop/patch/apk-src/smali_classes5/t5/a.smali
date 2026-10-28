.class public abstract Lt5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Ln5/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v2, Ll83/k;

    sget-object v1, Lgp/n;->I:Lgp/n;

    invoke-direct {v2, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v3, Ll83/k;

    sget-object v1, Lgp/n;->F:Lgp/n;

    invoke-direct {v3, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v4, Ll83/k;

    sget-object v1, Lgp/n;->M:Lgp/n;

    invoke-direct {v4, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v5, Ll83/k;

    sget-object v1, Lgp/n;->J:Lgp/n;

    invoke-direct {v5, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v6, Ll83/k;

    sget-object v1, Lgp/n;->K:Lgp/n;

    invoke-direct {v6, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v7, Ll83/k;

    sget-object v1, Lgp/n;->y:Lgp/n;

    invoke-direct {v7, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v8, Ll83/k;

    sget-object v1, Lgp/n;->H:Lgp/n;

    invoke-direct {v8, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v9, Ll83/k;

    sget-object v1, Lgp/n;->E:Lgp/n;

    invoke-direct {v9, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v10, Ll83/k;

    sget-object v1, Lgp/n;->L:Lgp/n;

    invoke-direct {v10, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v11, Ll83/k;

    sget-object v1, Lgp/n;->x:Lgp/n;

    invoke-direct {v11, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v12, Ll83/k;

    sget-object v1, Lgp/n;->z:Lgp/n;

    invoke-direct {v12, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ln5/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ln5/a;-><init>(I)V

    new-instance v13, Ll83/k;

    sget-object v1, Lgp/n;->G:Lgp/n;

    invoke-direct {v13, v1, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v2 .. v13}, [Ll83/k;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    const/16 v2, 0xc

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-static {v1, v0}, Lm83/g0;->f0(Ljava/util/HashMap;[Ll83/k;)V

    sput-object v1, Lt5/a;->a:Ljava/util/LinkedHashMap;

    return-void
.end method
