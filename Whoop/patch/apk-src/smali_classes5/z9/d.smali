.class public final Lz9/d;
.super La2/a;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:Z

.field public G:Z

.field public H:I

.field public final y:Lx8/n;

.field public final z:Lx8/n;


# direct methods
.method public constructor <init>(Lt9/k0;)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, p1, v0}, La2/a;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lx8/n;

    sget-object v0, Ly8/n;->a:[B

    invoke-direct {p1, v0}, Lx8/n;-><init>([B)V

    iput-object p1, p0, Lz9/d;->y:Lx8/n;

    new-instance p1, Lx8/n;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lx8/n;-><init>(I)V

    iput-object p1, p0, Lz9/d;->z:Lx8/n;

    return-void
.end method
