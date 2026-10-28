.class public final synthetic Ll9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/d;


# instance fields
.field public final synthetic E:Z

.field public final synthetic w:Lg9/d;

.field public final synthetic x:Ll9/t;

.field public final synthetic y:Ll9/y;

.field public final synthetic z:Ljava/io/IOException;


# direct methods
.method public synthetic constructor <init>(Lg9/d;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/g0;->w:Lg9/d;

    iput-object p2, p0, Ll9/g0;->x:Ll9/t;

    iput-object p3, p0, Ll9/g0;->y:Ll9/y;

    iput-object p4, p0, Ll9/g0;->z:Ljava/io/IOException;

    iput-boolean p5, p0, Ll9/g0;->E:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    move-object v0, p1

    check-cast v0, Ll9/i0;

    iget-object p1, p0, Ll9/g0;->w:Lg9/d;

    iget v1, p1, Lg9/d;->a:I

    iget-object v2, p1, Lg9/d;->b:Ll9/c0;

    iget-object v3, p0, Ll9/g0;->x:Ll9/t;

    iget-object v4, p0, Ll9/g0;->y:Ll9/y;

    iget-object v5, p0, Ll9/g0;->z:Ljava/io/IOException;

    iget-boolean v6, p0, Ll9/g0;->E:Z

    invoke-interface/range {v0 .. v6}, Ll9/i0;->b(ILl9/c0;Ll9/t;Ll9/y;Ljava/io/IOException;Z)V

    return-void
.end method
