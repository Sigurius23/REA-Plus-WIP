.class public final synthetic Lgr2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgr2/b;


# direct methods
.method public synthetic constructor <init>(Lgr2/b;I)V
    .locals 0

    iput p2, p0, Lgr2/f;->w:I

    iput-object p1, p0, Lgr2/f;->x:Lgr2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lgr2/f;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lgr2/f;->x:Lgr2/b;

    invoke-static {v0, p1, p2}, Lgr2/g;->d(Lgr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lgr2/f;->x:Lgr2/b;

    invoke-static {v0, p1, p2}, Lgr2/g;->b(Lgr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lgr2/f;->x:Lgr2/b;

    invoke-static {v0, p1, p2}, Lgr2/g;->c(Lgr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
