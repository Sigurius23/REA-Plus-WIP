.class public final synthetic Lch0/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lzg0/i;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lch0/v0;


# direct methods
.method public synthetic constructor <init>(Lzg0/i;Lbc3/c0;Lch0/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/b1;->w:Lzg0/i;

    iput-object p2, p0, Lch0/b1;->x:Lbc3/c0;

    iput-object p3, p0, Lch0/b1;->y:Lch0/v0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroid/net/Uri;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lch0/b1;->w:Lzg0/i;

    iget-object v1, p0, Lch0/b1;->x:Lbc3/c0;

    iget-object v2, p0, Lch0/b1;->y:Lch0/v0;

    invoke-static {v0, v1, v2, p1, p2}, Lch0/c1;->d(Lzg0/i;Lbc3/c0;Lch0/v0;Landroid/net/Uri;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
