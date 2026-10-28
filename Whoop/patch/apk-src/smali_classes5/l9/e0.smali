.class public final synthetic Ll9/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/d;
.implements Lp73/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lg9/d;Ll9/t;Ll9/y;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/e0;->x:Ljava/lang/Object;

    iput-object p2, p0, Ll9/e0;->y:Ljava/lang/Object;

    iput-object p3, p0, Ll9/e0;->z:Ljava/lang/Object;

    iput p4, p0, Ll9/e0;->w:I

    return-void
.end method

.method public synthetic constructor <init>(Lrq0/k;ILjava/lang/String;Lc93/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/e0;->x:Ljava/lang/Object;

    iput p2, p0, Ll9/e0;->w:I

    iput-object p3, p0, Ll9/e0;->y:Ljava/lang/Object;

    iput-object p4, p0, Ll9/e0;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Ll9/e0;->x:Ljava/lang/Object;

    check-cast v0, Lg9/d;

    iget-object v1, p0, Ll9/e0;->y:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ll9/t;

    iget-object v1, p0, Ll9/e0;->z:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ll9/y;

    move-object v2, p1

    check-cast v2, Ll9/i0;

    iget v3, v0, Lg9/d;->a:I

    iget-object v4, v0, Lg9/d;->b:Ll9/c0;

    iget v7, p0, Ll9/e0;->w:I

    invoke-interface/range {v2 .. v7}, Ll9/i0;->f(ILl9/c0;Ll9/t;Ll9/y;I)V

    return-void
.end method

.method public run()V
    .locals 4

    iget-object v0, p0, Ll9/e0;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/k;

    iget-object v1, p0, Ll9/e0;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Ll9/e0;->z:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget v3, p0, Ll9/e0;->w:I

    invoke-static {v0, v3, v1, v2}, Lrq0/k;->w(Lrq0/k;ILjava/lang/String;Lc93/a;)V

    return-void
.end method
