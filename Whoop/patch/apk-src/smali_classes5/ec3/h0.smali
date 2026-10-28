.class public final Lec3/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:Lec3/l;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(Lec3/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/h0;->w:Lec3/l;

    iput p2, p0, Lec3/h0;->x:I

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lec3/j0;

    iget v2, p0, Lec3/h0;->x:I

    invoke-direct {v1, v0, v2, p1}, Lec3/j0;-><init>(Lkotlin/jvm/internal/e0;ILec3/m;)V

    iget-object p1, p0, Lec3/h0;->w:Lec3/l;

    invoke-interface {p1, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
