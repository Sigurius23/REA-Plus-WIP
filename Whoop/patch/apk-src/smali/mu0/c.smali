.class public final synthetic Lmu0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmu0/c;->w:I

    iput p2, p0, Lmu0/c;->x:I

    iput p3, p0, Lmu0/c;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmu0/c;->y:I

    check-cast p1, Ltb/a;

    iget v1, p0, Lmu0/c;->w:I

    iget v2, p0, Lmu0/c;->x:I

    invoke-static {v1, v2, v0, p1}, Lmu0/e;->u(IIILtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
