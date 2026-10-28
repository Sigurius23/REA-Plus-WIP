.class public abstract Ln63/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ln63/a;->w:Ln63/a;

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    return-void
.end method

.method public static a(Lb63/b;Lad3/c;)V
    .locals 2

    sget-object v0, Li63/b;->a:Li63/d;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "contentType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm63/c;

    invoke-direct {v1, p1}, Lm63/c;-><init>(Lad3/c;)V

    invoke-static {p0, v0, v1}, Lge3/g;->R(Lk63/a;Li63/d;Lk63/b;)V

    return-void
.end method
