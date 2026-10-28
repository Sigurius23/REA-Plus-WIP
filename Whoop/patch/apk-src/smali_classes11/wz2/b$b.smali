.class Lwz2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwz2/b;-><init>(Landroid/content/Context;Landroid/graphics/SurfaceTexture;IILxg3/g;Lxg3/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbh3/b;"
    }
.end annotation


# instance fields
.field final synthetic w:Lwz2/b;


# direct methods
.method public constructor <init>(Lwz2/b;)V
    .locals 0

    iput-object p1, p0, Lwz2/b$b;->w:Lwz2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Luz2/a;)V
    .locals 1

    iget-object v0, p0, Lwz2/b$b;->w:Lwz2/b;

    invoke-static {v0, p1}, Lwz2/b;->a(Lwz2/b;Luz2/a;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Luz2/a;

    invoke-virtual {p0, p1}, Lwz2/b$b;->a(Luz2/a;)V

    return-void
.end method
