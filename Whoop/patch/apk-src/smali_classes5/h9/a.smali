.class public final Lh9/a;
.super La9/f;
.source "SourceFile"


# instance fields
.field public E:Landroid/graphics/Bitmap;

.field public final synthetic F:Lh9/b;


# direct methods
.method public constructor <init>(Lh9/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La9/a;-><init>(I)V

    iput-object p1, p0, Lh9/a;->F:Lh9/b;

    return-void
.end method


# virtual methods
.method public final o()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lh9/a;->E:Landroid/graphics/Bitmap;

    const/4 v0, 0x0

    iput v0, p0, La9/a;->x:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, La9/f;->y:J

    iput-boolean v0, p0, La9/f;->z:Z

    return-void
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lh9/a;->F:Lh9/b;

    invoke-virtual {v0, p0}, Lh9/b;->k(La9/f;)V

    return-void
.end method
