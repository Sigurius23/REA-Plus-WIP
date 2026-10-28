.class public final synthetic Lch0/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lzg0/i;

.field public final synthetic x:Lch0/v0;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lzg0/i;Lch0/v0;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/d1;->w:Lzg0/i;

    iput-object p2, p0, Lch0/d1;->x:Lch0/v0;

    iput-object p3, p0, Lch0/d1;->y:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lch0/d1;->x:Lch0/v0;

    iget-object v1, p0, Lch0/d1;->y:Lc93/a;

    iget-object v2, p0, Lch0/d1;->w:Lzg0/i;

    invoke-static {v2, v0, v1}, Lch0/c1$m;->f(Lzg0/i;Lch0/v0;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
