.class public abstract Lr93/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln83/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    sget-object v1, Lr93/h1;->c:Lr93/h1;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lr93/g1;->c:Lr93/g1;

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lr93/d1;->c:Lr93/d1;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lr93/i1;->c:Lr93/i1;

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lr93/j1;->c:Lr93/j1;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v0

    sput-object v0, Lr93/l1;->a:Ln83/f;

    return-void
.end method
