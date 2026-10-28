.class public final synthetic Lrq0/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic E:Ljava/util/List;

.field public final synthetic w:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

.field public final synthetic x:Lrq0/t0;

.field public final synthetic y:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final synthetic z:Leq0/x1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Lrq0/t0;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Leq0/x1;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq0/n0;->w:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iput-object p2, p0, Lrq0/n0;->x:Lrq0/t0;

    iput-object p3, p0, Lrq0/n0;->y:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput-object p4, p0, Lrq0/n0;->z:Leq0/x1;

    iput-object p5, p0, Lrq0/n0;->E:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget-object v3, p0, Lrq0/n0;->z:Leq0/x1;

    iget-object v4, p0, Lrq0/n0;->E:Ljava/util/List;

    iget-object v0, p0, Lrq0/n0;->w:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iget-object v1, p0, Lrq0/n0;->x:Lrq0/t0;

    iget-object v2, p0, Lrq0/n0;->y:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lrq0/t0;->V(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Lrq0/t0;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Leq0/x1;Ljava/util/List;Landroid/view/View;)V

    return-void
.end method
