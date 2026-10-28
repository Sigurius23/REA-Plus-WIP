package iq0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import eq0.C13506o;
import io.getstream.chat.android.models.Command;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iq0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Liq0/b;", "Landroidx/recyclerview/widget/i1;", "Liq0/b$a;", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/Command;", "Ll83/a0;", "onCommandClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "items", "setItems", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Liq0/b$a;", "getItemCount", "()I", "holder", "position", "b", "(Liq0/b$a;I)V", "a", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "commands", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20819b extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Function1 onCommandClick;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<Command> commands;

    /* JADX INFO: renamed from: iq0.b$a */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Liq0/b$a;", "Landroidx/recyclerview/widget/o2;", "Leq0/o;", "binding", "<init>", "(Leq0/o;)V", "Lio/getstream/chat/android/models/Command;", "command", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/models/Command;)V", "a", "Leq0/o;", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC1717o2 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C13506o binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13506o binding) {
            super(binding.getRoot());
            AbstractC22676k.m65750j(binding, "binding");
            this.binding = binding;
        }

        public final void bind(Command command) {
            AbstractC22676k.m65750j(command, "command");
            this.binding.f47502c.setText("/" + command.getName());
            this.binding.f47501b.setText(command.getDescription());
        }
    }

    public C20819b(Function1 onCommandClick) {
        AbstractC22676k.m65750j(onCommandClick, "onCommandClick");
        this.onCommandClick = onCommandClick;
        this.commands = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m57408d(a aVar, C20819b c20819b, View view) {
        int bindingAdapterPosition = aVar.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1) {
            c20819b.onCommandClick.invoke(c20819b.commands.get(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int position) {
        AbstractC22676k.m65750j(holder, "holder");
        holder.bind(this.commands.get(position));
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int viewType) {
        AbstractC22676k.m65750j(parent, "parent");
        C13506o c13506oM38220c = C13506o.m38220c(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC22676k.m65749i(c13506oM38220c, "inflate(...)");
        a aVar = new a(c13506oM38220c);
        aVar.itemView.setOnClickListener(new ViewOnClickListenerC20817a(this, aVar, 0));
        return aVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public int getItemCount() {
        return this.commands.size();
    }

    public final void setItems(List<Command> items) {
        AbstractC22676k.m65750j(items, "items");
        this.commands.clear();
        this.commands.addAll(items);
        notifyDataSetChanged();
    }
}
