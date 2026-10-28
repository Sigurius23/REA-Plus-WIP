.class public final synthetic Ljs1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Z

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljs1/d;->w:Ljava/lang/String;

    iput-boolean p2, p0, Ljs1/d;->x:Z

    iput p3, p0, Ljs1/d;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Ljs1/d;->w:Ljava/lang/String;

    iget-boolean v1, p0, Ljs1/d;->x:Z

    iget v2, p0, Ljs1/d;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ljs1/e;->a(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
