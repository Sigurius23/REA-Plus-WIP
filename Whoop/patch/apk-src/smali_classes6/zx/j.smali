.class public abstract Lzx/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Ly00/b;

    new-instance v1, Ly00/f;

    const-string v6, "4000000000000000"

    const-string v7, "4999999999999999"

    const/4 v8, 0x1

    invoke-direct {v1, v6, v7, v8}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v3, Ly00/a;->J:Ly00/a;

    sget-object v13, Ly00/j;->F:Ly00/j;

    const/16 v2, 0x10

    const/4 v5, 0x0

    move-object v4, v13

    invoke-direct/range {v0 .. v5}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    new-instance v9, Ly00/b;

    new-instance v10, Ly00/f;

    invoke-direct {v10, v6, v7, v8}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v12, Ly00/a;->y:Ly00/a;

    const/4 v14, 0x0

    const/16 v11, 0x10

    invoke-direct/range {v9 .. v14}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    filled-new-array {v0, v9}, [Ly00/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v2, "4000002500001001"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ly00/b;

    new-instance v10, Ly00/f;

    const-string v0, "5100000000000000"

    const-string v2, "5599999999999999"

    invoke-direct {v10, v0, v2, v8}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v12, v3

    invoke-direct/range {v9 .. v14}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    move-object v3, v9

    new-instance v9, Ly00/b;

    new-instance v10, Ly00/f;

    invoke-direct {v10, v0, v2, v8}, Ly00/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    sget-object v12, Ly00/a;->z:Ly00/a;

    invoke-direct/range {v9 .. v14}, Ly00/b;-><init>(Ly00/f;ILy00/a;Ly00/j;Ljava/lang/String;)V

    filled-new-array {v3, v9}, [Ly00/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "5555552500001001"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lzx/j;->a:Ljava/lang/Object;

    return-void
.end method
