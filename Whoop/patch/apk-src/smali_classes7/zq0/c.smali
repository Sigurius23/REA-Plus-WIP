.class public final synthetic Lzq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lm91/u;

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(ILm91/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzq0/c;->w:Lm91/u;

    iput p1, p0, Lzq0/c;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Lzq0/c;->w:Lm91/u;

    iget v1, p0, Lzq0/c;->x:I

    invoke-static {v0, v1, p1, p2}, Lzq0/f;->e(Lm91/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
