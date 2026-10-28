.class public final Ltd1/d$e;
.super Lf93/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd1/d;-><init>(Lq92/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf93/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "td1/d$e",
        "Lf93/b;",
        "Lj93/z;",
        "property",
        "oldValue",
        "newValue",
        "Ll83/a0;",
        "afterChange",
        "(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ltd1/d;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ltd1/d;)V
    .locals 0

    iput-object p2, p0, Ltd1/d$e;->w:Ltd1/d;

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/z;",
            "Ljk0/d;",
            "Ljk0/d;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljk0/d;

    check-cast p2, Ljk0/d;

    iget-object p1, p0, Ltd1/d$e;->w:Ltd1/d;

    invoke-static {p1}, Ltd1/d;->Q(Ltd1/d;)V

    return-void
.end method
