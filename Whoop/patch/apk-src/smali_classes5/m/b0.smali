.class public final synthetic Lm/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/j;


# instance fields
.field public final synthetic w:Lm/c0;


# direct methods
.method public synthetic constructor <init>(Lm/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/b0;->w:Lm/c0;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lm/b0;->w:Lm/c0;

    invoke-virtual {v0, p1}, Lm/c0;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
