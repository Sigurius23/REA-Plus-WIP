.class public final Lk63/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:Lbm/g;

.field public final synthetic x:Ljava/nio/charset/Charset;

.field public final synthetic y:Ls63/a;

.field public final synthetic z:Lio/ktor/utils/io/q;


# direct methods
.method public constructor <init>(Lbm/g;Ljava/nio/charset/Charset;Ls63/a;Lio/ktor/utils/io/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk63/e;->w:Lbm/g;

    iput-object p2, p0, Lk63/e;->x:Ljava/nio/charset/Charset;

    iput-object p3, p0, Lk63/e;->y:Ls63/a;

    iput-object p4, p0, Lk63/e;->z:Lio/ktor/utils/io/q;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    new-instance v0, Lk63/d;

    iget-object v4, p0, Lk63/e;->z:Lio/ktor/utils/io/q;

    const/4 v5, 0x0

    iget-object v2, p0, Lk63/e;->x:Ljava/nio/charset/Charset;

    iget-object v3, p0, Lk63/e;->y:Ls63/a;

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lk63/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lk63/e;->w:Lbm/g;

    invoke-virtual {p1, v0, p2}, Lbm/g;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
