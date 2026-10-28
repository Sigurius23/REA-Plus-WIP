.class public final synthetic Ljc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/d;


# instance fields
.field public final synthetic w:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Ljc/p;->w:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lub/c;)Lub/e;
    .locals 6

    iget-object v2, p1, Lub/c;->b:Ljava/lang/String;

    iget-object v3, p1, Lub/c;->c:Lub/b;

    const-string p1, "callback"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Lvb/i;

    iget-object v1, p0, Ljc/p;->w:Landroid/content/Context;

    const/4 v4, 0x1

    move v5, v4

    invoke-direct/range {v0 .. v5}, Lvb/i;-><init>(Landroid/content/Context;Ljava/lang/String;Lub/b;ZZ)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must set a non-null database name to a configuration that uses the no backup directory."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
