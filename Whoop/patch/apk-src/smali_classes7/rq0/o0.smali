.class public final synthetic Lrq0/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

.field public final synthetic y:Leq0/x1;

.field public final synthetic z:Lrq0/t0;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Leq0/x1;Lrq0/t0;I)V
    .locals 0

    iput p4, p0, Lrq0/o0;->w:I

    iput-object p1, p0, Lrq0/o0;->x:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iput-object p2, p0, Lrq0/o0;->y:Leq0/x1;

    iput-object p3, p0, Lrq0/o0;->z:Lrq0/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget v0, p0, Lrq0/o0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/o0;->y:Leq0/x1;

    iget-object v1, p0, Lrq0/o0;->z:Lrq0/t0;

    iget-object v2, p0, Lrq0/o0;->x:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    invoke-static {v2, v0, v1, p1}, Lrq0/t0;->L(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Leq0/x1;Lrq0/t0;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/o0;->y:Leq0/x1;

    iget-object v1, p0, Lrq0/o0;->z:Lrq0/t0;

    iget-object v2, p0, Lrq0/o0;->x:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    invoke-static {v2, v0, v1, p1}, Lrq0/t0;->Q(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Leq0/x1;Lrq0/t0;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
