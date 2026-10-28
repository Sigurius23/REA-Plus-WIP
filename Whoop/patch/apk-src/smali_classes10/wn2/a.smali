.class public final synthetic Lwn2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Lwn2/b;

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lio2/h;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn2/a;->w:Lwn2/b;

    iput-object p2, p0, Lwn2/a;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lwn2/a;->y:Lio2/h;

    iput-object p4, p0, Lwn2/a;->z:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lwn2/a;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lwn2/a;->w:Lwn2/b;

    iget-object v1, p0, Lwn2/a;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lwn2/a;->y:Lio2/h;

    iget-object v3, p0, Lwn2/a;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lwn2/a;->E:I

    invoke-static/range {v0 .. v6}, Lwn2/b;->a(Lwn2/b;Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
