.class public final synthetic Lb41/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lb41/f;

.field public final synthetic x:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lb41/f;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb41/c;->w:Lb41/f;

    iput-object p2, p0, Lb41/c;->x:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb41/c;->w:Lb41/f;

    iget-object v1, p0, Lb41/c;->x:Lp1/c1;

    invoke-static {v0, v1}, Lb41/d;->h(Lb41/f;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
