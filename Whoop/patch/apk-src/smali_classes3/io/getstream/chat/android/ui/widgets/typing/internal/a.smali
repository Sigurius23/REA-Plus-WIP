.class public final synthetic Lio/getstream/chat/android/ui/widgets/typing/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/a;->a:Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/typing/internal/a;->a:Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;->a(Lio/getstream/chat/android/ui/widgets/typing/internal/TypingDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method
