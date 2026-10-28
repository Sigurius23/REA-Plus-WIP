.class public final Lv03/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public w:Lv03/h;


# direct methods
.method public static a(Lv03/h;Lv03/h;)V
    .locals 1

    check-cast p0, Lv03/b;

    iget-object v0, p0, Lv03/b;->w:Lv03/h;

    if-nez v0, :cond_0

    iput-object p1, p0, Lv03/b;->w:Lv03/h;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lv03/b;->w:Lv03/h;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
