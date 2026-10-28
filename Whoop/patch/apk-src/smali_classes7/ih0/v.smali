.class public final synthetic Lih0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ZZZLc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lih0/v;->w:Z

    iput-boolean p2, p0, Lih0/v;->x:Z

    iput-boolean p3, p0, Lih0/v;->y:Z

    iput-object p4, p0, Lih0/v;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-boolean v0, p0, Lih0/v;->w:Z

    iget-boolean v1, p0, Lih0/v;->x:Z

    iget-boolean v2, p0, Lih0/v;->y:Z

    iget-object v3, p0, Lih0/v;->z:Lc93/a;

    invoke-static/range {v0 .. v5}, Lih0/e0;->y(ZZZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
