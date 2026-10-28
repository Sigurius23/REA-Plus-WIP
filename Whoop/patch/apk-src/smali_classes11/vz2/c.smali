.class public final synthetic Lvz2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageReader$OnImageAvailableListener;


# instance fields
.field public final synthetic a:Lvz2/e;


# direct methods
.method public synthetic constructor <init>(Lvz2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvz2/c;->a:Lvz2/e;

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroid/media/ImageReader;)V
    .locals 1

    iget-object v0, p0, Lvz2/c;->a:Lvz2/e;

    invoke-static {v0, p1}, Lvz2/e;->d(Lvz2/e;Landroid/media/ImageReader;)V

    return-void
.end method
