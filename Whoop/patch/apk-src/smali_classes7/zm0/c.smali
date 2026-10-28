.class public final synthetic Lzm0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lzm0/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzm0/c;->w:I

    check-cast p1, Lxf3/c;

    check-cast p2, Luf3/a;

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lzm0/d;->b(Lxf3/c;Luf3/a;)Lbn0/c;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1, p2}, Lzm0/d;->a(Lxf3/c;Luf3/a;)Lzm0/b;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lzm0/d;->d(Lxf3/c;Luf3/a;)Lcn0/c;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2}, Lzm0/d;->c(Lxf3/c;Luf3/a;)Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
