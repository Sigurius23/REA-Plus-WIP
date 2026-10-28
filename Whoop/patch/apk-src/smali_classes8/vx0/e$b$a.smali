.class final Lvx0/e$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvx0/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lvx0/e;


# direct methods
.method public constructor <init>(Lvx0/e;)V
    .locals 0

    iput-object p1, p0, Lvx0/e$b$a;->w:Lvx0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lft0/a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft0/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lvx0/e$b$a;->w:Lvx0/e;

    invoke-static {p2}, Lvx0/e;->j(Lvx0/e;)Lec3/p1;

    move-result-object p2

    :goto_0
    move-object v0, p2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lvx0/d;

    const/16 v9, 0x3d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v10}, Lvx0/d;->b(Lvx0/d;Ljava/util/List;Lft0/a;ZLjava/util/List;Ljava/lang/String;ZILjava/lang/Object;)Lvx0/d;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    move-object p1, v4

    goto :goto_0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lft0/a;

    invoke-virtual {p0, p1, p2}, Lvx0/e$b$a;->b(Lft0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
