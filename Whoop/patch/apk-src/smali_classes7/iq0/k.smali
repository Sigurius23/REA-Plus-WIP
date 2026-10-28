.class public final synthetic Liq0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/ChatEventListener;


# instance fields
.field public final synthetic w:Liq0/m;

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Liq0/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liq0/k;->w:Liq0/m;

    iput-object p2, p0, Liq0/k;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 2

    iget-object v0, p0, Liq0/k;->w:Liq0/m;

    iget-object v1, p0, Liq0/k;->x:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Liq0/m;->A(Liq0/m;Ljava/lang/String;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method
