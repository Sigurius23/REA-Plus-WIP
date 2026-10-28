.class final Lmi1/f$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmi1/f;->a(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hapticsstrapservice.SmartAlarmHapticsWrapperImpl"
    f = "SmartAlarmHapticsWrapperImpl.kt"
    l = {
        0xc2,
        0xc5
    }
    m = "disableAlarm"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lmi1/f;

.field y:I


# direct methods
.method public constructor <init>(Lmi1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmi1/f;",
            "Lq83/d<",
            "-",
            "Lmi1/f$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmi1/f$d;->x:Lmi1/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmi1/f$d;->w:Ljava/lang/Object;

    iget p1, p0, Lmi1/f$d;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmi1/f$d;->y:I

    iget-object p1, p0, Lmi1/f$d;->x:Lmi1/f;

    invoke-virtual {p1, p0}, Lmi1/f;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
