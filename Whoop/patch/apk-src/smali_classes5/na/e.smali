.class public final synthetic Lna/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyr/e;
.implements Ly8/r;


# instance fields
.field public final synthetic w:Lna/h;


# direct methods
.method public synthetic constructor <init>(Lna/h;)V
    .locals 0

    iput-object p1, p0, Lna/e;->w:Lna/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JLx8/n;)V
    .locals 1

    iget-object v0, p0, Lna/e;->w:Lna/h;

    iget-object v0, v0, Lna/h;->I:[Lt9/k0;

    invoke-static {p1, p2, p3, v0}, Lt9/a;->d(JLx8/n;[Lt9/k0;)V

    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lna/o;

    iget-object v0, p0, Lna/e;->w:Lna/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method
